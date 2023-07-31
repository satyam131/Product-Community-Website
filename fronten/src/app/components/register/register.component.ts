import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { MatDialog } from '@angular/material/dialog';


@Component({
  selector: 'register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {
  message = '';
  alert: any;
  constructor(private userService: UserService, private dialog: MatDialog) { }
  public user = {
    firstName: '',
    lastName: '',
    username: '',
    password: ''

  }
  ngOnInit(): void {
  }

  formSubmit() {
    this.userService.addUser(this.user)

      .subscribe((response) => {
        console.log(response);
        this.alert = true;
        this.message = 'User Registered...'
        alert("User Registered Successfully");
        window.location.reload();
      
      },
        error => {
          this.message = "User Already exists";
        });
  }
  closeAlert() {
    this.alert = false;
  }
}
