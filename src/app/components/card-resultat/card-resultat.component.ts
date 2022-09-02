import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup } from '@angular/forms';


@Component({
  selector: 'app-card-resultat',
  templateUrl: './card-resultat.component.html',
  styleUrls: ['./card-resultat.component.css']
})
export class CardResultatComponent implements OnInit {
  loginForm : FormGroup = this.fb.group({  //Crée une instance de FormGroup
    username: [],                   // Crée une instance de FormControl
    password: [],                   // Crée une instance de FormControl
  });

  constructor(private fb:FormBuilder) {}

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
