import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'add-products',
  templateUrl: './add-products.component.html',
  styleUrls: ['./add-products.component.css']
})
export class AddProductsComponent implements OnInit {

  constructor(private userService: UserService) { }

  ngOnInit(): void {
  }
  public product = {
    productName: '',
    brandName: '',
    code: ''
  }

  addproduct() {
    this.userService.addProducts(this.product).subscribe
      (
        data => {
          console.log(data);
          alert("Product Added Successfully");
          this.reloadPage();

        }, error => {
        console.log(error);
      })

  }
  reloadPage(): void {
    window.location.reload();
  }


}
