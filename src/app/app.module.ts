import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InscriptionComponent } from './pages/inscription/inscription.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ConnexionComponent } from './pages/connexion/connexion.component';
import { ResearchComponent } from './components/research/research.component';
import { CarrouselComponent } from './components/carrousel/carrousel.component';
import { LandingpageComponent } from './pages/landingpage/landingpage.component';
import { InscriptionEnfantComponent } from './components/inscription-enfant/inscription-enfant.component';
import { UserComponent } from './pages/user/user.component';
import { CardEnfantComponent } from './components/card-enfant/card-enfant.component';

@NgModule({
  declarations: [
    AppComponent,
    InscriptionComponent,
    ConnexionComponent,
    LandingpageComponent,
    ResearchComponent,
    CarrouselComponent,
    InscriptionEnfantComponent,
    UserComponent,
    CardEnfantComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    NgbModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
