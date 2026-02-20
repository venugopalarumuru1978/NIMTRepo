import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { Test1Component } from './test1/test1.component';
import { Test2Component } from './test2/test2.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
    {path:"home", component:HomeComponent},
    {path:"test1", component:Test1Component},
    {path:"test2", component:Test2Component},
    {path:"emp", component:EmployeeComponent},
    {path:"login", component:LoginComponent},
];
