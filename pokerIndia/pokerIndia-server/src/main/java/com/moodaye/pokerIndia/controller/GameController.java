package com.moodaye.pokerIndia.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moodaye.pokerIndia.model.Game;

@RestController
public class GameController {

//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/game")
	public String getGames() {
		return "This call will retrieve all games for the current player";
	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/game")
	public Game createGames() {
		return new Game();
	}
}