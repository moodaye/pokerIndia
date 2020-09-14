package com.moodaye.pokerIndia.poc2.websocket;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.stereotype.Component;

@Component
public class MessagingApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    private final MessageSendingOperations<String> messagingTemplate;

    @Autowired
    public MessagingApplicationListener(MessageSendingOperations<String> messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
    }

    public void p() {
        messagingTemplate.convertAndSend("/topic/greetings", new Greeting("Balloo!"));
    }

}