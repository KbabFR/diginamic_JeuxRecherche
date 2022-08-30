import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardResultatComponent } from './card-resultat.component';

describe('CardResultatComponent', () => {
  let component: CardResultatComponent;
  let fixture: ComponentFixture<CardResultatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardResultatComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardResultatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
