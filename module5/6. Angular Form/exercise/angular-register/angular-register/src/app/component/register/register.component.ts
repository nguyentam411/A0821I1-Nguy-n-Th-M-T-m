import {Component, OnInit} from '@angular/core';
import {AbstractControl,FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  registerForm = new FormGroup({
      email: new FormControl("", [Validators.required, Validators.email]),
    pw:new FormGroup({
      password: new FormControl("", [Validators.required, Validators.minLength(6)]),
      confirmPassword: new FormControl("", [Validators.required, Validators.minLength(6)]),

    },this.comparePassword),
      country: new FormControl("", [Validators.required]),
      age: new FormControl("", [Validators.required, Validators.min(18)]),
      gender: new FormControl("", [Validators.required]),
      phone: new FormControl("", [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)])
    },
    // {validators: this.mustMatch("password","confirmPassword"}
  )

  constructor() {
  }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.registerForm.value)
  }

  get email() {
    return this.registerForm.get('email')
  }

  get password() {
    return this.registerForm.get('pw').get('password');
  }

  get confirmPassword() {
    return this.registerForm.get('pw').get('confirmPassword');
  }

  get country() {
    return this.registerForm.get('country')
  }

  get age() {
    return this.registerForm.get('age')
  }

  get gender() {
    return this.registerForm.get('gender')
  }

  get phone() {
    return this.registerForm.get('phone')
  }
  comparePassword(c: AbstractControl) {
    const v = c.value;
    return (v.password === v.confirmPassword) ? null : {
      passwordNotMatch: true
    };
  }
}
