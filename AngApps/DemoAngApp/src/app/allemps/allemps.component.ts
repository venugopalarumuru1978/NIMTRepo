import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { EmpInfo } from '../emp-info';
import { NgFor } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-allemps',
  standalone: true,
  imports: [NgFor],
  templateUrl: './allemps.component.html',
  styleUrl: './allemps.component.css'
})
export class AllempsComponent {
  empinfo:EmpInfo[] = [];
  
  constructor(private empServ:EmployeeService, private router:Router){
    this.getEmpInfo();
  }
  
  getEmpInfo()
  {
    this.empServ.GetAllEmployees().subscribe(result=>{
      this.empinfo = result;
      console.log(this.empinfo);    
  });
  }

  delEmp(id:any)
  {
    this.empServ.DeleteEmployee(id).subscribe(result=>{
      console.log(result);
      this.getEmpInfo();
    });
  }

  getempbasedonID(id:any)
  {
    this.router.navigate(['/search', id]);
  }
}
