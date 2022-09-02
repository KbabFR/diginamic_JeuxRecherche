import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MlpcComponent } from './mlpc.component';

describe('MlpcComponent', () => {
  let component: MlpcComponent;
  let fixture: ComponentFixture<MlpcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MlpcComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MlpcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
