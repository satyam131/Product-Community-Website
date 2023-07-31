import { Component, OnInit } from '@angular/core';
import { Router ,ActivatedRoute} from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'view-review',
  templateUrl: './view-review.component.html',
  styleUrls: ['./view-review.component.css']
})
export class ViewReviewComponent implements OnInit {

  constructor(private userService:UserService,private router:ActivatedRoute) { }
  list:any;

  ngOnInit(): void {
    this.userService.getProductById(this.router.snapshot.params['productId']).subscribe(data=>{
    this.list=data;
  })

}
}