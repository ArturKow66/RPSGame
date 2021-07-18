package com.rpsGame;

public class Player {

    private String playerName;
    private int numberOfWins;

    public Player(String playerName, int numberOfWins) {
        this.playerName = playerName;
        this.numberOfWins = numberOfWins;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
}
