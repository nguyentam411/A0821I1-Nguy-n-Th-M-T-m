import {Component, OnInit} from '@angular/core';
import {Todo} from "../todo";
import {FormControl, FormGroup} from "@angular/forms";
import {TodoService} from "../../service/todo.service";
import {Router} from "@angular/router";

let _id = 1;

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
  // todos: Todo[] = [];
  // inputControl = new FormControl();
  // constructor( private todoService: TodoService) { }
  // ngOnInit() {
  //   this.todoService.getTodos().subscribe(next=>{
  //       console.log(next)
  //     this.todos=next;
  //   },error => {
  //     console.log(error);
  //   },()=>{
  //     console.log('complete')
  //     }
  //   )
  // }
  //
  // // toggleTodo( i ) { }
  // toggleTodo(i: number) {
  //     this.todos[i].completed = !this.todos[i].completed;
  //   }
  // addTodo() { }
  // deleteTodo(i: number) {
  //   const  todo=this.todos[i]
  //   this.todoService.delete(i).subscribe(next=>{
  //     console.log(next);
  //     this.todos=this.todos.filter(
  //       t=>t.id!==todo.id
  //     )
  //     this.todoService.getTodos()
  //   },error => {},()=>{
  //   });
  //
  // }
  todos: Todo[] = [];
  contentInput: FormGroup;
  todo: Todo;

  constructor(
    private todoService: TodoService,
    private router: Router
  ) {
  }

  ngOnInit() {
    this.todoService.getTodos().subscribe(data=>{
        console.log(data)
      this.todos=data
    },error => {
        console.log(error)
      }
      );
    this.contentInput=new FormGroup({
      id:new FormControl(''),
      content:new FormControl(""),
      complete:new FormControl(false)
    })
  }
  toggleTodo(id: number) {
    this.todoService.getById(id).subscribe(data=>{
      this.todo = data;
      this.todo.complete = !this.todo.complete;
      this.todoService.update(id, this.todo).subscribe(()=>{
        console.log("success");
        location.reload();
      }, error => {
        console.log("error");
      });
    }, error => {
      console.log("errors");
    })
  }
  change() {
    this.todoService.save(this.contentInput.value).subscribe(()=>{
      console.log("success");
      alert("Ban da tao thanh cong " +this.contentInput.value.content);
      location.reload();
    }, error => {
      console.log("errors");
    })
  }
  delete(id: number) {
    this.todoService.delete(id).subscribe(()=>{
      console.log("success");
      location.reload();
    }, error => {
      console.log("error");
    })
  }
}
