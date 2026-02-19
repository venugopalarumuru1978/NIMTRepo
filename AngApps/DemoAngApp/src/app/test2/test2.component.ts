import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-test2',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './test2.component.html',
  styleUrl: './test2.component.css'
})
export class Test2Component {
    sname:string = '';
    gender:string = '';
    isGraduate:boolean = false;
    location:string = '';
    msg:string = '';


    PrintDetails():void{
      this.msg = "Student Name : " + this.sname;
      this.msg += "<br />Gender : " + this.gender;
      if(this.isGraduate==true)
        this.msg += "<br />Graudate Person : ";
        else
        this.msg += "<br />Not Graudate Person : ";
      this.msg += "<br />Location is : " + this.location;
    }
}
