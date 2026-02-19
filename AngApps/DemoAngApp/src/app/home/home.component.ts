import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

    sname:string = "Ramana Rao";
    age:number = 25;
    url:string = "http://www.google.com/";


    ChangeData() : void
    {
      this.sname = "Praveen Kumar";
      this.age = 23;
    }

}
