import { Component, OnInit } from '@angular/core';
import {Todo} from "../todo";
import {FormControl} from "@angular/forms";
import {TodoService} from "../../service/todo.service";

let _id=1;

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  // todos: Todo[]=[];
  // content=new FormControl();
  //
  //
  // constructor() { }
  //
  // ngOnInit(): void {
  // }
  //
  // change() {
  //   const value = this.content.value;
  //   if (value) {
  //     const todo: Todo = {
  //       id: _id++,
  //       content: value,
  //       complete: false
  //     };
  //     this.todos.push(todo);
  //     this.content.reset();
  //   }
  // }
  // toggleTodo(i: number) {
  //   this.todos[i].complete = !this.todos[i].complete;
  // }
  todos: Todo[] = [];
  inputControl = new FormControl();
  constructor( private todoService: TodoService) { }
  ngOnInit() {
    this.todoService.getTodos().subscribe(next=>{
        console.log(next)
      this.todos=next;
    },error => {
      console.log(error);
    },()=>{
      console.log('complete')
      }
    )
  }

  // toggleTodo( i ) { }
  toggleTodo(i: number) {
      this.todos[i].completed = !this.todos[i].completed;
    }
  addTodo() { }
  deleteTodo(i: number) {
    const  todo=this.todos[i]
    this.todoService.delete(i).subscribe(next=>{
      console.log(next);
      this.todos=this.todos.filter(
        t=>t.id!==todo.id
      )
      this.todoService.getTodos()
    },error => {},()=>{
    });

  }
}
