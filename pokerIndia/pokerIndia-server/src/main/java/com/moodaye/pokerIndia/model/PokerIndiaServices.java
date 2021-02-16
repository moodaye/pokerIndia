package com.moodaye.pokerIndia.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moodaye.pokerIndia.model.Game;

@SpringBootApplication
@RestController
public class PokerIndiaServices {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/game")
	public String getGames() {
		return "This call will retrieve all games for the current player";
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/game")
	public Game createGames() {
		return new Game();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PokerIndiaServices.class);
	}
}
