import { Component, OnInit } from '@angular/core';
import { CreateGameService } from '../services/create-game.service';

@Component({
  selector: 'app-cockpit',
  templateUrl: './cockpit.component.html',
  styleUrls: ['./cockpit.component.less']
})
export class CockpitComponent implements OnInit {

 constructor(private createGameService: CreateGameService){}

  ngOnInit(): void {
  }
  createGame(){
    console.log("create game called");
    this.createGameService.createGame().subscribe((resp) => console.log(resp));
  }

}
