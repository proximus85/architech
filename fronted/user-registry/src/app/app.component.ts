import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";
import {UserCredentials} from "./UserCredentials";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'user-registry';
  accountRegistryForm: FormGroup;
  userCredentials: UserCredentials;


  constructor(private formBuilder: FormBuilder, private httpClient: HttpClient) {
  }

  ngOnInit(): void {
    this.accountRegistryForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    })
  }

  onSubmit() {
    this.userCredentials = {
      username: this.accountRegistryForm.controls.username.value,
      password: this.accountRegistryForm.controls.password.value
    }
    this.httpClient.post('http://localhost:8080/account', this.userCredentials)
      .subscribe(result => {
          this.accountRegistryForm.reset()
          console.log(result);
        },
        error => {
          console.log(error);
        });
  }
}
