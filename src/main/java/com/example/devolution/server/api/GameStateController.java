package com.example.devolution.server.api;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.devolution.server.domain.GameState;

@RestController(value = "/api")
public class GameStateController {
	
	private HashSet<GameState> gameStates;
	
	@Autowired
	public GameStateController() {
		this.gameStates = new HashSet<>();
	}
	
	@PostMapping(value = "/state/update")
	public ResponseEntity<GameState> updateGameState() {
		
		return null;
	}

}
