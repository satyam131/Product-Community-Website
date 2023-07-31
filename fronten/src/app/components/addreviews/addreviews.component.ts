import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { FormControl, FormGroup } from '@angular/forms';
@Component({
  selector: 'addreviews',
  templateUrl: './addreviews.component.html',
  styleUrls: ['./addreviews.component.css']
})
export class AddreviewsComponent implements OnInit {
  review = new FormGroup({
    review: new FormControl(''),
    rating: new FormControl(''),
     })

  constructor(private userService:UserService,private route:Router,private router:ActivatedRoute) { }
  
  ngOnInit(): void {
  }
  addReview()
  {
    console.log(this.router.snapshot.params['productId']);
    //console.log(this.review,this.review.rating);
    console.log(this.review.value);
    this.userService.addReview(this.router.snapshot.params['productId'],this.review.value)
    .subscribe(
      data=>
      {
        console.log(data);
        alert("Review Added Successfully");
        window.location.reload();
      },error=>
      {
        console.log(error);
      }
    )

  }

}
