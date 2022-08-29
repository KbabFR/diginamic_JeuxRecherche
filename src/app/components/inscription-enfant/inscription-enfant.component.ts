import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';

@Component({
  selector: 'app-inscription-enfant',
  templateUrl: './inscription-enfant.component.html',
  styleUrls: ['./inscription-enfant.component.css']

})
export class InscriptionEnfantComponent implements OnInit {
  loginFormEnfant : FormGroup = this.fb.group({  //Crée une instance de FormGroup
    username: [],                   // Crée une instance de FormControl
    password: [],                   // Crée une instance de FormControl
  });
  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
  }
  
  displayStyle = "none";
  
  openPopup() {
    this.displayStyle = "block";
  }
  closePopup() {
    this.displayStyle = "none";
  }

}
