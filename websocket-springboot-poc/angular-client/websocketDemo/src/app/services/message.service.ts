import { Injectable } from '@angular/core';

declare var SockJS;
declare var Stomp;

@Injectable({
  providedIn: 'root'
})

export class MessageService {


  constructor() {
    console.log("constructing message service");
    this.initializeWebSocketConnection();
  }

  public stompClient;
  public msg = [];


  initializeWebSocketConnection() {
    console.log("initializing web socket connection");
    const serverUrl = 'http://localhost:8080/gs-guide-websocket'; 
    const ws = new SockJS(serverUrl);

    this.stompClient = Stomp.over(ws);
    const that = this;
    // tslint:disable-next-line:only-arrow-functions
    this.stompClient.connect({}, function (frame) {
      that.stompClient.subscribe('/topic/greetings', (message) => {
        if (message.body) {
          that.msg.push(message.body);
        }
      });
    });
  }

  sendMessage(message) {
    console.log("sending hello");
    this.stompClient.send('/app/hello', {}, JSON.stringify(message));
  }
}
