import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bernardproject';
  private _connected:boolean = false;
public get connected(){
  return this._connected;
}
public set connected(value:boolean){
  this._connected=value;
}
}

