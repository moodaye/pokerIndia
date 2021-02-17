import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CreateGameService {

  url: string = environment.domainPokerIndia + environment.gameService;

  constructor(private http : HttpClient) { }

  createGame() : Observable<any>{
    return this.http.put<any>(this.url, "").pipe();
  }
}
