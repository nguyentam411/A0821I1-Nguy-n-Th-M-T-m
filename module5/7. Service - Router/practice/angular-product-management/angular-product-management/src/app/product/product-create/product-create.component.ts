import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Router} from "@angular/router";
import {Category} from "../../model/Category";
import {CategoryService} from "../../service/category.service";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})

export class ProductCreateComponent implements OnInit {
  productForm: FormGroup = new FormGroup({
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
    category: new FormControl()
  });
  categories: Category[] = [];
  constructor(private productService: ProductService,private router:Router,
              private categoryService:CategoryService) { }

  ngOnInit(): void {
    this.getAllCategory()
  }
  submit() {
    const product = this.productForm.value;
    product.category = {
      id: product.category
    };
    console.log(product.category)
    this.productService.saveProduct(product).subscribe(()=>{
      alert('Tạo thành công');
      this.productForm.reset();
    },e=>{
      console.log(e)
    });
  }
  getAllCategory() {
    this.categoryService.getAll().subscribe(categoires => {
      this.categories = categoires;
    });
  }
}
