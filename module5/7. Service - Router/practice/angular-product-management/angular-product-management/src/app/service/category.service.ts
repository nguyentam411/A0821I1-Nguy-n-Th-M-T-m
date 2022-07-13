import {Injectable} from '@angular/core';
import {Category} from "../model/Category";
import {environment} from "../../environments/environment";
import {HttpClient} from "@angular/common/http";

const API_URL = `${environment.apiUrl}`;

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private http: HttpClient) {
  }

  getAll() {
    return this.http.get<Category[]>(API_URL + '/categories');
  }

  saveCategory(category) {
    return this.http.post<Category>(API_URL + '/categories', category);
  }

  findById(id: number) {
    return this.http.get<Category>(`${API_URL}/categories/${id}`);
  }

  updateCategory(id: number, category: Category) {
    return this.http.put<Category>(`${API_URL}/categories/${id}`, category);
  }

  deleteCategory(id: number) {
    return this.http.delete<Category>(`${API_URL}/categories/${id}`);
  }
}
