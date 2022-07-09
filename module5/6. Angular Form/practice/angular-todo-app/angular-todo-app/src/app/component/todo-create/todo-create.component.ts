import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {TodoService} from "../../service/todo.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-todo-create',
  templateUrl: './todo-create.component.html',
  styleUrls: ['./todo-create.component.css']
})
export class TodoCreateComponent implements OnInit {
todoForm:FormGroup=new FormGroup({
  id: new FormControl(),
  tittle: new FormControl(),
  completed: new FormControl(),
})
  constructor(private todoService=TodoService,private router:Router) {

  }

  ngOnInit(): void {
  }
  submit() {
    const todo = this.todoForm.value;
    console.log(todo)
    // this.todoService.save()
    this.router.navigateByUrl("/todos/create")
    this.todoForm.reset();
  }

}
