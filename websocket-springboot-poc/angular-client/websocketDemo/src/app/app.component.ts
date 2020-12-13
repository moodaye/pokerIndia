import { Component } from '@angular/core';
import { MessageService } from './services/message.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'websocketDemo';
  input;
  constructor(private messageService: MessageService){}
 
  sendMessage(){
    if(this.input){
      this.messageService.sendMessage(this.input);
      this.input = '';
    }
  }
}
