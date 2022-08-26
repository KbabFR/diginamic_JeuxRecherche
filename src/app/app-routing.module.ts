import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConnexionComponent } from './pages/connexion/connexion.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';
import { LandingpageComponent } from './pages/landingpage/landingpage.component';

const routes: Routes = [
  {
    path: 'inscription',
    component: InscriptionComponent
  },
  {
    path:'connexion',
    component: ConnexionComponent
  },
  {
    path:'',
    component: LandingpageComponent
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
