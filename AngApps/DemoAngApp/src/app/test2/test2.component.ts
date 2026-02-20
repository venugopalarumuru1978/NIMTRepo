import { NgClass, NgFor, NgIf } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-test2',
  standalone: true,
  imports: [FormsModule, NgIf, NgClass, NgFor],
  templateUrl: './test2.component.html',
  styleUrl: './test2.component.css'
})
export class Test2Component {
    sname:string = '';
    gender:string = '';
    isGraduate:boolean = false;
    location:string = '';
    msg:string = '';
    cssClass:string = '';

    cities:string[]  = ["Hyderbad", "Bangalore", "Amaravathi", "Mumbai", "Pune"]; 


    PrintDetails():void{
      this.msg = "Student Name : " + this.sname;
      this.msg += "<br />Gender : " + this.gender;
      if(this.isGraduate==true)
      {
        this.msg += "<br />Graudate Person ";
        this.cssClass = "textcolor1";  // textcolor1 is a css class name;
      }        
        else{
          this.msg += "<br />Not Graudate Person ";
          this.cssClass = "textcolor2";  // textcolor2 is a css class name;
        }
        
      this.msg += "<br />Location is : " + this.location;
    }
}
