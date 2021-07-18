package com.rpsGame.game;

import com.rpsGame.game.inGame.InGameChoice;
import com.rpsGame.game.inGame.InGameChoiceInfo;
import com.rpsGame.game.inGame.display.InGameChoiceDisplay;
import com.rpsGame.game.inGame.display.InGameMenuDisplay;
import com.rpsGame.game.inGame.display.LogicEngineDisplay;
import com.rpsGame.game.inGame.display.ScoreKeeperDisplay;

public class RPSGame {

    private int gameCounter;
    private int winner;
    private boolean isRoundFinish = false;
    private boolean isThisGame = false;

    InGameMenuDisplay inGameMenuDisplay = new InGameMenuDisplay();
    InGameChoice inGameChoice = new InGameChoice();
    InGameChoiceDisplay inGameChoiceDisplay = new InGameChoiceDisplay();
    LogicEngineDisplay logicEngineDisplay = new LogicEngineDisplay();
    ScoreKeeperDisplay scoreKeeperDisplay = new ScoreKeeperDisplay();

    public void runGame(int gameVersion, int numberOfWins) {
        while (!isRoundFinish) {
            gameCounter++;

            while (!isThisGame){
                char rpsPlayerChoiceChar = inGameMenuDisplay.runInGameMenu(gameVersion, gameCounter);
                InGameChoiceInfo inGameChoiceInfo = inGameChoice.runInGameChoice(gameVersion, rpsPlayerChoiceChar);

                if (inGameChoiceInfo.inGameChoiceInfoLogic.isOptionInteger()) {
                    int rpsComputerChoiceInt = inGameChoiceDisplay.runInGameChoiceDisplay(gameVersion, inGameChoiceInfo.getPlayerChoiceString());
                    winner = logicEngineDisplay.runLogicEngine(inGameChoiceInfo.getRpsPlayerChoiceInt(), rpsComputerChoiceInt);
                    isRoundFinish = scoreKeeperDisplay.runScoreKeeper(winner, numberOfWins);
                    isThisGame = true;
                } else if (inGameChoiceInfo.inGameChoiceInfoLogic.isReset()) {
                    gameCounter = 0;
                    inGameChoiceInfo.resetInGameChoice();
                    scoreKeeperDisplay.resetRunKeeper();
                    isThisGame = true;
                } else if (inGameChoiceInfo.inGameChoiceInfoLogic.isExit()) {
                    inGameChoiceInfo.resetInGameChoice();
                    scoreKeeperDisplay.resetRunKeeper();
                    isRoundFinish = true;
                    isThisGame = true;
                } else {
                    inGameChoiceInfo.resetInGameChoice();
                }
            }
            isThisGame = !isThisGame;
        }
    }
}
