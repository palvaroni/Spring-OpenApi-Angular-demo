import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { HelloService } from './api/v1';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public helloMessage?: string;
  public apiDescription: string = '';

  constructor(private http: HttpClient, private hello: HelloService) { }

  async ngOnInit() {
    this.http.get('http://localhost:8080/v3/api-docs')
      .subscribe(response => {
        this.apiDescription = JSON.stringify(response, null, 2);
      });

    this.hello.get('Roni').subscribe(result => this.helloMessage = result.message);
  }

}
