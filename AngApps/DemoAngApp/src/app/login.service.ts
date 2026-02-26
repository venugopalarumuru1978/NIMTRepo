import { Injectable } from '@angular/core';
import { Users } from './users';
@Injectable({
  providedIn: 'root'
})
export class LoginService {

  uinfo:Users[] = [
    new Users('pavan', '12345'),
    new Users('karan', '12345'),
    new Users('lavan', '12345')
  ]

  constructor() { }

  UserCheck(uname:string,pwd:string):number
  {
    let uchk = 0;
      for(let i=0;i<this.uinfo.length;i++)
      {
        if(this.uinfo[i].uname==uname && this.uinfo[i].pswd==pwd)
        {
          uchk = 1;
          break;
        }
      }
    return uchk;
  }
}
