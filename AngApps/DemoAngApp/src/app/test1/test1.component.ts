import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-test1',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './test1.component.html',
  styleUrl: './test1.component.css'
})
export class Test1Component {

  x:number = 0;
  y:number = 0;
  msg:string = '';

  Addition():void
  {
    let sum = parseInt(this.x.toString()) + parseInt(this.y.toString());
    this.msg = "Addition is " + sum;
  }
  
}
