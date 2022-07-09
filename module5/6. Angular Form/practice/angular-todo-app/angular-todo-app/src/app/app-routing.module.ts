import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TodoComponent} from "./component/todo/todo.component";
import {TodoCreateComponent} from "./component/todo-create/todo-create.component";


const routes: Routes = [
  // {
  //   path: '',
  //   component: TodoComponent
  // },
  // {
  //   path: 'todos/create',
  //   component: TodoCreateComponent
  // }
  //

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
