import { NgIf, NgSwitch, NgSwitchCase, NgSwitchDefault } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-test1',
  standalone: true,
  imports: [FormsModule, NgIf, NgSwitch, NgSwitchCase, NgSwitchDefault],
  templateUrl: './test1.component.html',
  styleUrl: './test1.component.css'
})
export class Test1Component {

  x:number = 0;
  y:number = 0;
  msg:string = '';
  chk:boolean = false;
  country:string = '';

  Addition():void
  {
    let sum = parseInt(this.x.toString()) + parseInt(this.y.toString());
    this.msg = "Addition is " + sum;
    if(sum<0)
      this.chk = false;
    else
      this.chk = true;
  }
  
}
