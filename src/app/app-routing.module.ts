import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InscriptionEnfantComponent } from './components/inscription-enfant/inscription-enfant.component';
import { ConnexionComponent } from './pages/connexion/connexion.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';
import { LandingpageComponent } from './pages/landingpage/landingpage.component';
import { UserComponent } from './pages/user/user.component';
import { ResultatComponent } from './pages/resultat/resultat.component';

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
  },
  {
    path:'inscription-enfant',
    component: InscriptionEnfantComponent
  },
   {
    path:'user',
    component : UserComponent
   },
   {
    path:'recherche',
    component: ResultatComponent
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
