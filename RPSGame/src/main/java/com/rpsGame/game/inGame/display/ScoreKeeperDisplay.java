package com.rpsGame.game.inGame.display;

import com.rpsGame.game.inGame.display.strings.RPSGameStrings;

public class ScoreKeeperDisplay {

    private boolean isWinner;
    private int playerWinsCounter = 0;
    private int computerWinsCounter = 0;

    RPSGameStrings rpsGameStrings = new RPSGameStrings();

    public boolean runScoreKeeper(int winner, int numberOfWins) {
        if (winner == 1 && (playerWinsCounter += 1) == numberOfWins) {
            System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
            System.out.println(rpsGameStrings.YOU_WON_GAME_STRING);
            isWinner = true;
        } else if (winner == 2 && (computerWinsCounter += 1) == numberOfWins) {
            System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
            System.out.println(rpsGameStrings.YOU_LOST_GAME_STRING);
            isWinner = true;
        } else {
            System.out.println(rpsGameStrings.SCORE_STRING + playerWinsCounter + " : " + computerWinsCounter);
            isWinner = false;
        }
        return isWinner;

    }

    public void resetRunKeeper() {
        playerWinsCounter = 0;
        computerWinsCounter = 0;
    }
}
