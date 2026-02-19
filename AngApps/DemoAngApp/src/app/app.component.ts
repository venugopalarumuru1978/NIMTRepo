import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { Test1Component } from './test1/test1.component';
import { HomeComponent } from './home/home.component';
import { Test2Component } from './test2/test2.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, Test1Component, HomeComponent, Test2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'DemoAngApp';
}
