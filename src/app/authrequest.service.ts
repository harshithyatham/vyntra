import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { login } from './login/login';
import { Observable } from 'rxjs';
import { register } from './register/register';

@Injectable({
  providedIn: 'root'
})
export class AuthrequestService {

  constructor( private http:HttpClient) { }
  login(login:login):Observable<any>
  {
    return this.http.post("http://localhost:8080/authenticate",login,{responseType: 'text'});
  }
  register(user:register):Observable<any>
  {
    return this.http.post("http://localhost:8080/customer",user,{responseType:'text'});
  }
}
