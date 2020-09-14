package com.moodaye.pokerIndia.poc2.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

@Component
public class ScheduledTasks {
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	
	@Autowired
	GreetingController gc;
	
	@Autowired
	MessagingApplicationListener mal;
	
	@Autowired
	SimpMessagingTemplate smt;
	
	@Scheduled(fixedRate = 5000)
	public void dealTwoCards() throws Exception{
		log.info("dealing");
		mal.p();
//		simple();
//		gc.greeting(new HelloMessage("scheduled message dawg"));
//		greeting(new HelloMessage("test g"));
	}
	
	public void simple() {
		smt.convertAndSend("/topic/greetings", "Test");
	}
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public static Greeting greeting(HelloMessage message) throws Exception{
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()));
	}

}
