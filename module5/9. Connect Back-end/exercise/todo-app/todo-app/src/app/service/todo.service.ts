import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ITodo} from "../model/ITodo";
import {map} from "rxjs/operators";
const API_URL='http://localhost:3000/todos';
@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private http:HttpClient) { }
  getTodos(count=10):Observable<ITodo[]>{
    return this.http.get<ITodo[]>(' http://localhost:3000/todos').pipe(
      map(data=>data.filter((todo,i)=>i<count))
    )
  }
  updateTodo(todo:ITodo):Observable<ITodo>{
    return this.http.patch<ITodo>
    ('http://localhost:3000/todos/'+todo.id,todo)
  }
  deleteTodo(id:number):Observable<any>{
    return this.http.delete('http://localhost:3000/todos/'+id)
  }
  createTodo(todo:Partial<ITodo>):Observable<ITodo>{
    return this.http.post<ITodo>('http://localhost:3000/todos',todo);
  }
}
