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
import { CardComponent } from './components/card/card.component';
import { DragScrollModule } from 'ngx-drag-scroll';
import { ResultatComponent } from './pages/resultat/resultat.component';
import { CardResultatComponent } from './components/card-resultat/card-resultat.component';
import { CardAvisComponent } from './components/card-avis/card-avis.component';
import { CarrouselAvisComponent } from './components/carrousel-avis/carrousel-avis.component';
import { MlpcComponent } from './pages/mlpc/mlpc.component';
import { ContactComponent } from './pages/contact/contact.component';
import { ProposComponent } from './pages/propos/propos.component';
import { BlogComponent } from './pages/blog/blog.component';


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
    CardComponent,
    ResultatComponent,
    CardResultatComponent,
    CardAvisComponent,
    CarrouselAvisComponent,
    MlpcComponent,
    ContactComponent,
    ProposComponent,
    BlogComponent, 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    NgbModule,
    DragScrollModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
