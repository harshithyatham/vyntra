import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {product} from 'src/app/product/product';
import {ProductService} from 'src/app/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 pro:Observable<product[]>;
 product:product;
  constructor(private proreq:ProductService,private route:Router) { }
  
  ngOnInit(): void {
    this.proreq.getproducts().subscribe(data=>
      this.pro=data);
    }
  gotocartpage()
  {
    this.route.navigate(['\cart']);
  }
  addtoc(id:number)
  {
    this.route.navigate(['\cart',id]);
  }
}
