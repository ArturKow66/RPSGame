package com.rpsGame.game;

import com.rpsGame.KeyboardReader;
import com.rpsGame.Player;
import com.rpsGame.game.inGame.display.strings.NewGameStrings;

public class NewGameCreator {

    private boolean isThereName;
    private boolean isThereNumber;
    private Player player;
    private int howManyWins = 0;


    NewGameStrings newGameStrings = new NewGameStrings();
    KeyboardReader keyboardReader = new KeyboardReader();

    public NewGameCreator(boolean isThereName, boolean isThereNumber, Player player) {
        this.isThereName = isThereName;
        this.isThereNumber = isThereNumber;
        this.player = player;
    }

    public boolean isThereName() {
        return isThereName;
    }

    public boolean setThereName(boolean thereName) {
        isThereName = thereName;
        return thereName;
    }

    public boolean isThereNumber() {
        return isThereNumber;
    }

    public void setThereNumber(boolean thereNumber) {
        isThereNumber = thereNumber;
    }

    public void createNewGameStep1() {
        while (!isThereName()) {
            if (!isThereName()) {
                System.out.println(newGameStrings.ENTER_NAME_STRING);
                String playerName = keyboardReader.readKeyboard();
                player.setPlayerName(playerName);
                System.out.println(newGameStrings.HELLO_PLAYER_STRING + player.getPlayerName());
                NewGameCreator.this.setThereName(true);
            } else {
                System.out.println(newGameStrings.IF_NO_NAME_STRING);
            }
        }
    }
    public int createNewGameStep2() {
        while (!isThereNumber()) {
            if (!isThereNumber()) {
                System.out.println(newGameStrings.HOW_MANY_WINS_STRING);
                try{
                    player.setNumberOfWins(Integer.parseInt(keyboardReader.readKeyboard()));
                } catch (Exception a) {
                    System.out.println("Exception: " + a);
                }

                howManyWins = player.getNumberOfWins();

                if (howManyWins > 0) {                                                  //try to catch?
                    System.out.println(newGameStrings.NUMBER_OF_WINS_STRING + howManyWins );
                    NewGameCreator.this.setThereNumber(true);
                } else {
                    System.out.println(newGameStrings.IF_NO_WINS_TO_PLAY_STRING);
                }
            }
        }
        return howManyWins;
    }
}
