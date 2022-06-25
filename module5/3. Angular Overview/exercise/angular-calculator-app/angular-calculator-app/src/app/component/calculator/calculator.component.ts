import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  num1: number;
  num2: number;
  result: number;
  operator;

  constructor() {
  }

  ngOnInit(): void {
  }

  onSelectChange(value: any) {
    this.operator = value;
  }

  calculate() {
    switch (this.operator) {
      case '+':
        this.result = this.num1 + this.num2;
        break;
      case '-':
        this.result=this.num1 - this.num2;
        break;
      case '*':
        this.result=this.num1 * this.num2;
        break;
      case '/':
        this.result=this.num1 / this.num2;
        break;

    }
  }
}
