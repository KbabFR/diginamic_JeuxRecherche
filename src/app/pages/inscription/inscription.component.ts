import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent implements OnInit {
  loginForm : FormGroup = this.fb.group({  //Crée une instance de FormGroup
    username: [],                   // Crée une instance de FormControl
    password: [],                   // Crée une instance de FormControl
  });

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    
  }

}
