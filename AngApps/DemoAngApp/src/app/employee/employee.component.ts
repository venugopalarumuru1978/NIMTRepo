import { Component } from '@angular/core';
import { Employee } from '../employee';
import { CurrencyPipe, LowerCasePipe, NgFor, UpperCasePipe } from '@angular/common';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-employee',
  standalone: true,
  imports: [NgFor, FormsModule, UpperCasePipe, LowerCasePipe, CurrencyPipe],
  templateUrl: './employee.component.html',
  styleUrl: './employee.component.css'
})
export class EmployeeComponent {

empinfo:Employee[] = [
  new Employee(101, 'Pavan', 'Manager',12000.00),
  new Employee(102, 'Pavani', 'Develoer',10000.00),
  new Employee(103, 'Praveen', 'Tester',9000.00),
  new Employee(104, 'Praveena', 'Developer',10000.00),
  new Employee(105, 'Paramesh', 'Tester',9000.00)];

  emp:Employee = new Employee(0, '','',0.0);

  AddEmployee():void 
  {
    this.empinfo.push(new Employee(this.emp.id, this.emp.ename, this.emp.job, this.emp.sal));    
    this.emp.id = 0;
    this.emp.ename = '';
    this.emp.job = '';
    this.emp.sal = 0.0;
  }


  DeleteEmp(ind:number)
  {
    this.empinfo.splice(ind, 1);
  }

}

