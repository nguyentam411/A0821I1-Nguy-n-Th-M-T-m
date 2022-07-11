import { Component, OnInit } from '@angular/core';
import {ITodo} from "../../model/ITodo";
import {FormControl} from "@angular/forms";
import {TodoService} from "../../service/todo.service";

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
todoList:ITodo[]=[];
inputControl=new FormControl();
  constructor(private todoServicce : TodoService) { }

  ngOnInit(): void {
    this.todoServicce.getTodos().subscribe(next=>{
      this.todoList=next;
    },error => {
      console.log(error);
    },()=>{
      console.log('complete');
    })
  }
toggleTodo(i){
  console.log('hello')
    const todo=this.todoList[i];
    const todoData={
      ...todo,
      completed: !todo.completed
    };
    this.todoServicce.updateTodo(todoData).subscribe(next=>{
      console.log('hi')
      this.todoList[i].completed=next.completed;
    })
}
  addTodo(){
    const todo:Partial<ITodo>={
      title:this.inputControl.value,
      completed:false,
    };
    this.todoServicce.createTodo(todo).subscribe(next=>{
      this.todoList.unshift(next);
      this.inputControl.setValue('');
    })
  }
  deleteTodo(i){
    const todo=this.todoList[i];
    this.todoServicce.deleteTodo(todo.id).subscribe(()=>{
      this.todoList=this.todoList.filter(
        t=>t.id!==todo.id
      );
    });
  }
}
