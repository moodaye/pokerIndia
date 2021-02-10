import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CreateGameService {

  url: string = "http://localhost:8080/game";

  constructor(private http : HttpClient) { }

  createGame() : Observable<any>{
    return this.http.put<any>(this.url, "").pipe();
  }
}