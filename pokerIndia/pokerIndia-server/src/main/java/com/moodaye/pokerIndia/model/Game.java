package com.moodaye.pokerIndia.model;

import java.util.UUID;

public class Game {
	UUID uuid;
	
	public Game() {
		this.uuid = UUID.randomUUID();
	}
	
	public UUID getUuid(){
		return this.uuid;
	}
}
