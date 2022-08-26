import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-landingpage',
  templateUrl: './landingpage.component.html',
  styleUrls: ['./landingpage.component.css']
})
export class LandingpageComponent implements OnInit {
  loginForm : FormGroup = this.fb.group({  //Crée une instance de FormGroup
    username: [],                   // Crée une instance de FormControl
    password: [],                   // Crée une instance de FormControl
  });

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    
  }

}
