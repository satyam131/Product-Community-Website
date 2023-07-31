import { Component, OnInit } from '@angular/core';

import { UserService } from '../services/user.service';
@Component({
  selector: 'search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor(private userService: UserService) { }
  productName: any
  message: any;
  product: any;
  ngOnInit(): void {
  }
  searchByproductName() {
    this.userService.getproductByProductName(this.productName)
      .subscribe(
        res => {
          console.log(res);
          this.product = res;
          console.log("In this", this.product)
          if (this.product.length == 0) {
            this.message = "No product found";
          }
          else {
            this.message = '';
          }
        },
        error => {
          console.log(error);
        }
      )
  }
}
