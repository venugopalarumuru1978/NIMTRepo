import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EmpInfo } from './emp-info';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private hclient:HttpClient) { }

  private url:string = "http://localhost:3000/Employee";

  GetAllEmployees():Observable<EmpInfo[]>
  {
    return this.hclient.get<EmpInfo[]>(`${this.url}`);
  }

  SearchEmployee(id:any):Observable<EmpInfo>
  {
    return this.hclient.get<EmpInfo>(`${this.url}/${id}`);
  }

  AddingNewEmployee(emp:EmpInfo):Observable<EmpInfo>{

    return this.hclient.post<EmpInfo>(`${this.url}`,emp);
  }

  DeleteEmployee(id:any):Observable<EmpInfo>{
    return this.hclient.delete<EmpInfo>(`${this.url}/${id}`)
  }
}
