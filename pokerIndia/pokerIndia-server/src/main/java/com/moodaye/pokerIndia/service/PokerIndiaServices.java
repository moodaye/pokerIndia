package com.moodaye.pokerIndia.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moodaye.pokerIndia.model.Game;

@SpringBootApplication(scanBasePackages = "com.moodaye.pokerIndia")
public class PokerIndiaServices {
	public static void main(String[] args) {
		SpringApplication.run(PokerIndiaServices.class);
	}
}
