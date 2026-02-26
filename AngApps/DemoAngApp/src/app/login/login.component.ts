import { CommonModule } from '@angular/common';
import { Component, NgModule } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  uname:string = '';
  pwd:string = '';
  msg:string = '';

  constructor(private logServ:LoginService, private router:Router){}

  LoginCheck(form:any):void
  {
    if(form.valid)
    {
      //if(this.uname == "Venugopal" && this.pwd=="v@123")
      if(this.logServ.UserCheck(this.uname, this.pwd)==1)
        //this.msg = "Valid User";
      this.router.navigate(['/welcome']);
      else
        this.msg = "Please check username/password";
    }
    else
      this.msg="Invalid Form";
  }
}
