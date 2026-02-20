import { CommonModule } from '@angular/common';
import { Component, NgModule } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  uname:string = '';
  pwd:string = '';
  msg:string = '';


  LoginCheck():void
  {
    console.log(this.uname);
    console.log(this.pwd);
    if(this.uname == "Venugopal" && this.pwd=="v@123")
      this.msg = "Valid User";
    else
      this.msg = "Not Valid User";
  }
}
