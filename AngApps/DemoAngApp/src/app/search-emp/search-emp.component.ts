import { Component } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { ActivatedRoute, Router } from '@angular/router';
import { EmpInfo } from '../emp-info';

@Component({
  selector: 'app-search-emp',
  standalone: true,
  imports: [],
  templateUrl: './search-emp.component.html',
  styleUrl: './search-emp.component.css'
})
export class SearchEmpComponent {
id:any = 0;
emp:EmpInfo = new EmpInfo();
constructor(private empServ:EmployeeService, 
  private router:Router, 
  private route:ActivatedRoute)
{
  this.id = this.route.snapshot.params['id'];

  this.empServ.SearchEmployee(this.id).subscribe(result=>{
    this.emp = result;
  });
}




}
