import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ObservableInput, Observable } from 'rxjs';
import { product } from './product/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }
  getproducts():Observable<any>
  {
    let token="Bearer "+localStorage.getItem("tkey");
    return this.http.get("http://localhost:8080/product",{headers: new HttpHeaders().set('Authorization',token)});
  }
  getproductbyid(id:number):Observable<product>
  {
    let token="Bearer "+localStorage.getItem("tkey");
    return this.http.get<product>("http://localhost:8080/product/"+id,{headers: new HttpHeaders().set('Authorization',token)});

  }
}
