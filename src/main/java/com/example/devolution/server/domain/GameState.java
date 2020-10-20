package com.example.devolution.server.domain;

public class GameState {
	
	private Long gameId;
	private Long currentPlayerId;
	
	private int currentTurn;
	private int turnLimit;
	
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public int getCurrentTurn() {
		return currentTurn;
	}
	public void setCurrentTurn(int currentTurn) {
		this.currentTurn = currentTurn;
	}
	public int getTurnLimit() {
		return turnLimit;
	}
	public void setTurnLimit(int turnLimit) {
		this.turnLimit = turnLimit;
	} 
	
	@Override
	public int hashCode() {
		return gameId.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		return getGameId() == ((GameState)other).getGameId();
	}

}
