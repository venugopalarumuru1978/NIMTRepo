import { Component } from '@angular/core';
import { EmpInfo } from '../emp-info';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-emp',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './add-emp.component.html',
  styleUrl: './add-emp.component.css'
})
export class AddEmpComponent {
  emp:EmpInfo = new EmpInfo();
  constructor(private empServ:EmployeeService, private router:Router){}

  newEmp()
  {
    this.empServ.AddingNewEmployee(this.emp).subscribe(result=>{
      console.log(result);
      this.router.navigate(['/emps']);
    });
  }



}
