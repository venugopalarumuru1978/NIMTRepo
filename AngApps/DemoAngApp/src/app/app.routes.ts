import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { Test1Component } from './test1/test1.component';
import { Test2Component } from './test2/test2.component';
import { EmployeeComponent } from './employee/employee.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RegFormComponent } from './reg-form/reg-form.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AllempsComponent } from './allemps/allemps.component';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { SearchEmpComponent } from './search-emp/search-emp.component';

export const routes: Routes = [
    {path:"home", component:HomeComponent},
    {path:"test1", component:Test1Component},
    {path:"test2", component:Test2Component},
    {path:"emp", component:EmployeeComponent},
    {path:"login", component:LoginComponent},
    {path:"reg", component:RegFormComponent},
    {path:"welcome", component:WelcomeComponent},
    {path:"emps", component:AllempsComponent},
    {path:"addemp", component:AddEmpComponent},
    {path:"search/:id", component:SearchEmpComponent},
];
