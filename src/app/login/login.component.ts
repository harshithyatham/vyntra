import { Component, OnInit } from '@angular/core';
import{login} from './login';
import { Router } from '@angular/router';
import {AuthrequestService} from 'src/app/authrequest.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
login:login=new login();
  constructor(private auth:AuthrequestService,private route:Router) { 
    
  }
  
  ngOnInit(): void {
  }
  loginto()
  {
    this.auth.login(this.login).subscribe(data=>
      localStorage.setItem("tkey",data));
      this.route.navigate(['*']);
  }
}
