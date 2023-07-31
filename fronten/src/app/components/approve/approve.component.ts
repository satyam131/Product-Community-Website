import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';

@Component({
  selector: 'approve',
  templateUrl: './approve.component.html',
  styleUrls: ['./approve.component.css']
})
export class ApproveComponent implements OnInit {

  constructor(private userService: UserService) { }
  collection: any;
  ngOnInit(): void {
    this.userService.allReview().subscribe((result: any) => {
      console.log(result)
      this.collection = result;

    }, err => { console.log(err) })
  }
  public approve(id: any) {
    this.userService.approveReview(id, "approved").subscribe(
      res => {
        console.log(res);
        alert("Product Approved");
        window.location.reload();
      }, error => {
      console.log(error);
    }
    )
  }
  
  public disApprove(id: any) {
    this.userService.approveReview(id, "disapproved").subscribe()
    alert("Product Disapproved");
    window.location.reload();
  }

}
