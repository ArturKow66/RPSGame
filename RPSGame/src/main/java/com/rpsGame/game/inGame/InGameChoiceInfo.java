package com.rpsGame.game.inGame;

public class InGameChoiceInfo {

    private int rpsPlayerChoiceInt;
    private String playerChoiceString;
    public InGameChoiceInfoLogic inGameChoiceInfoLogic;

    public InGameChoiceInfo(int rpsPlayerChoiceInt, String playerChoiceString, InGameChoiceInfoLogic inGameChoiceInfoLogic) {
        this.rpsPlayerChoiceInt = rpsPlayerChoiceInt;
        this.playerChoiceString = playerChoiceString;
        this.inGameChoiceInfoLogic = inGameChoiceInfoLogic;
    }

    public int getRpsPlayerChoiceInt() {
        return rpsPlayerChoiceInt;
    }

    public void setRpsPlayerChoiceInt(int rpsPlayerChoiceInt) {
        this.rpsPlayerChoiceInt = rpsPlayerChoiceInt;
    }

    public String getPlayerChoiceString() {
        return playerChoiceString;
    }

    public void setPlayerChoiceString(String playerChoiceString) {
        this.playerChoiceString = playerChoiceString;
    }

    public void repeatInGameChoice() {
        this.inGameChoiceInfoLogic.setIsOptionInteger(false);
        this.rpsPlayerChoiceInt = 0;
    }

    public void resetInGameChoice() {
        this.inGameChoiceInfoLogic.setIsReset(false);
        this.inGameChoiceInfoLogic.setIsExit(false);
        this.inGameChoiceInfoLogic.setIsOptionInteger(false);
    }
}
