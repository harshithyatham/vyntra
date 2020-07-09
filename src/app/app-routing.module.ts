import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { ProductComponent } from './product/product.component';
import { CartComponent } from './cart/cart.component';


const routes: Routes = [
  {path:'login',component:LoginComponent},
  {path:'reg',component:RegisterComponent},
  {path:'*',component:HomeComponent},
  {path:'product',component:ProductComponent},
  {path:'cart',component:CartComponent},
  {path:'cart/:id',component:CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
