import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllempsComponent } from './allemps.component';

describe('AllempsComponent', () => {
  let component: AllempsComponent;
  let fixture: ComponentFixture<AllempsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AllempsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllempsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
