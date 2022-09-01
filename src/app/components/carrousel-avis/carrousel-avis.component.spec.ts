import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarrouselAvisComponent } from './carrousel-avis.component';

describe('CarrouselAvisComponent', () => {
  let component: CarrouselAvisComponent;
  let fixture: ComponentFixture<CarrouselAvisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CarrouselAvisComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CarrouselAvisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
