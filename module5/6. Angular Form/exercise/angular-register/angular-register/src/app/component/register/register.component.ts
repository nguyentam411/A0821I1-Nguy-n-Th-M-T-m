import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Register} from "./register";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registers: Register[] = []
  registerForm = new FormGroup({
    email: new FormControl("",[Validators.required,Validators.email]),
    password: new FormControl("",[Validators.required,Validators.minLength(6)]),
    confirmPassword: new FormControl("",[Validators.required,Validators.minLength(6)]),
    country: new FormControl("",[Validators.required]),
    age: new FormControl("",[Validators.required,Validators.min(18)]),
    gender: new FormControl("",[Validators.required]),
    phone: new FormControl("",[Validators.required,Validators.pattern( /^\+84\d{9,10}$/)])
  })
  contactForm: any;

  constructor() {
  }

  ngOnInit(): void {
  }

  onSubmit() {
    const value = this.registerForm.value;
    this.registers.push(value);
    this.registerForm.reset();
  }
}
