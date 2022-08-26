import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConnexionComponent } from './pages/connexion/connexion.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';

const routes: Routes = [
  {
    path: 'inscription',
    component: InscriptionComponent
  },
  {
    path:'connexion',
    component: ConnexionComponent
  }
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
