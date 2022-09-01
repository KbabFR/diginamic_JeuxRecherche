import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardAvisComponent } from './card-avis.component';

describe('CardAvisComponent', () => {
  let component: CardAvisComponent;
  let fixture: ComponentFixture<CardAvisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CardAvisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CardAvisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
