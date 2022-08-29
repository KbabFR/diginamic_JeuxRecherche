import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InscriptionEnfantComponent } from './inscription-enfant.component';

describe('InscriptionEnfantComponent', () => {
  let component: InscriptionEnfantComponent;
  let fixture: ComponentFixture<InscriptionEnfantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InscriptionEnfantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InscriptionEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
