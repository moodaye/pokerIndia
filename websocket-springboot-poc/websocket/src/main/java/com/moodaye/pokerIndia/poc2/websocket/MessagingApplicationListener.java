package com.moodaye.pokerIndia.poc2.websocket;

import java.util.Random;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

@Component
public class MessagingApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    private final MessageSendingOperations<String> messagingTemplate;
    
    private static String[] deck = {
    		"As", "Ks", "Qs", "Js", "Ts", "9s", "8s", "7s", "6s", "5s", "4s", "3s", "2s",
    		"Ah", "Kh", "Qh", "Jh", "Th", "9h", "8h", "7h", "6h", "5h", "4h", "3h", "2h",
    		"Ad", "Kd", "Qd", "Jd", "Td", "9d", "8d", "7d", "6d", "5d", "4d", "3d", "2d",
    		"Ac", "Kc", "Qc", "Jc", "Tc", "9c", "8c", "7c", "6c", "5c", "4c", "3c", "2c"};
    		

    @Autowired
    public MessagingApplicationListener(MessageSendingOperations<String> messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    }

    public void p() {
    	Random rand = new Random();
    	int card1 = rand.nextInt() % 52;
    	if(card1 < 0) card1 *= -1;
    	int card2 = rand.nextInt() % 52;
    	if(card2 < 0) card2 *= -1;
    	
        messagingTemplate.convertAndSend("/topic/greetings", new Greeting(deck[card1] + " " + deck[card2]));
    }

}