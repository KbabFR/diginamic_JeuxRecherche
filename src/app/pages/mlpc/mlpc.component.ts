import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';

@Component({
  selector: 'app-mlpc',
  templateUrl: './mlpc.component.html',
  styleUrls: ['./mlpc.component.css']
})
export class MlpcComponent implements OnInit {
  loginForm : FormGroup = this.fb.group({  //Crée une instance de FormGroup
    username: [],                   // Crée une instance de FormControl
    password: [],                   // Crée une instance de FormControl
  });
  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
  }

}
