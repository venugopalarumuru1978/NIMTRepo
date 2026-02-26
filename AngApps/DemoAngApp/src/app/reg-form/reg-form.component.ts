import { NgIf } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reg-form',
  standalone: true,
  imports: [ReactiveFormsModule, NgIf],
  templateUrl: './reg-form.component.html',
  styleUrl: './reg-form.component.css'
})
export class RegFormComponent {
  result:any;
  msg:string = '';

  constructor(private frmbuild:FormBuilder)
  {

  }

  regForm = this.frmbuild.group({
    personname: this.frmbuild.control('', [Validators.required]),
    phone:this.frmbuild.control('', [Validators.required, Validators.maxLength(10), Validators.minLength(10)]),
    email:this.frmbuild.control('', [Validators.required])
  });
  
  printDetails()
  {
    if(this.regForm.valid)
    {
      this.result = "Person Name : " + this.regForm.value.personname;
      this.result += "<br />Phone Number : " + this.regForm.value.phone;
      this.result += "<br />Email : " + this.regForm.value.email;
      this.msg = this.result; 
    }
    else 
    this.msg = "Invalid Form";
  }
}
