import { Component } from '@angular/core';
import { CreateGameService } from './services/create-game.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'pokerIndiaUI';

  constructor(private createGameService: CreateGameService){}

  createGame(){
    console.log("create game called");
    this.createGameService.createGame().subscribe((resp) => console.log(resp));
  }
}
