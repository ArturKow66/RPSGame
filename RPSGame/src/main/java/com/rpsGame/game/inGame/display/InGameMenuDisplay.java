package com.rpsGame.game.inGame.display;

import com.rpsGame.KeyboardReader;
import com.rpsGame.game.inGame.display.strings.RPSGameStrings;

public class InGameMenuDisplay {

    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    KeyboardReader keyboardReader = new KeyboardReader();

    public char runInGameMenu(int gameVersion, int gameCounter) {
        if (gameVersion == 1 || gameVersion == 2){
            System.out.println(
                    "\n" + "\n" +
                            rpsGameStrings.GAME_COUNT_STRING + gameCounter + "\n" +
                            rpsGameStrings.GAME_CHOICE_STRING + "\n"+
                            rpsGameStrings.ROCK_STRING + "\n" +
                            rpsGameStrings.PAPER_STRING + "\n" +
                            rpsGameStrings.SCISSORS_STRING
            );
            if (gameVersion == 2) {
                System.out.println(
                        rpsGameStrings.LIZARD_STRING + "\n" +
                                rpsGameStrings.SPOCK_STRING
                );
            }
            System.out.println(
                    "\n" +
                            rpsGameStrings.STOP_GAME_STRING + "\n" +
                            rpsGameStrings.RESET_GAME_STRING
            );
            char[] rpsPlayerChoiceList = keyboardReader.readKeyboardToChar();
            return rpsPlayerChoiceList[0];
        }
        return 'r';
    }
}
