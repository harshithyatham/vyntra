import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';
import { product } from '../product/product';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  product1:product[]=[];
  pro:product;
  constructor(private route:ActivatedRoute,private prod:ProductService) { 
   
  }
  
  ngOnInit(): void {
    let i=parseInt(this.route.snapshot.paramMap.get('id'));
  
    this.prod.getproductbyid(i).subscribe(data=>
      this.product1.push(data));
     
      
  }
  
  
}
