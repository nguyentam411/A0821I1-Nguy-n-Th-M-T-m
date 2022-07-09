import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Todo} from "../component/todo";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  private readonly API_URL = 'http://localhost:3000/todos';

  constructor(private http: HttpClient) {
  }

  getTodos(): Observable<Todo[]> {
    return this.http.get<Todo[]>(this.API_URL)
  }

  delete(i: number) {
    return this.http.delete<Todo>("http://localhost:3000/todos/" + i)
  }

  save(todo: Todo) {
    return this.http.put<Todo>("http://localhost:3000/todos",todo)

  }
}
