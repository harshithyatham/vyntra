import { Component, OnInit } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import {register} from './register';
import { AuthrequestService } from '../authrequest.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  user:register=new register();
  constructor(private auth:AuthrequestService,private route:Router) { 
    this.user.active=true;
    this.user.roles="USER_ROLE";
  }
  
  ngOnInit(): void {
  }
  registerto()
  {
    this.auth.register(this.user).subscribe(data=>
      console.log(data));
      this.route.navigate(['\login']);
  }
}
