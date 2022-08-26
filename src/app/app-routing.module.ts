import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InscriptionComponent } from './components/inscription/inscription.component';

const routes: Routes = [
  {
    path: 'inscription',
    component: InscriptionComponent
  },
];
 
  //{path: '**', redirectTo: '/error/404'}

  @NgModule({
    imports: [RouterModule.forRoot(routes, {
      //paramsInheritanceStrategy: 'always',
      //enableTracing: true,
    })],
    exports: [RouterModule]
  })
export class AppRoutingModule { }
