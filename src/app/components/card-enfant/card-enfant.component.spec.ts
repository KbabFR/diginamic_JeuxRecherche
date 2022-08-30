import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardEnfantComponent } from './card-enfant.component';

describe('CardEnfantComponent', () => {
  let component: CardEnfantComponent;
  let fixture: ComponentFixture<CardEnfantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardEnfantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardEnfantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
