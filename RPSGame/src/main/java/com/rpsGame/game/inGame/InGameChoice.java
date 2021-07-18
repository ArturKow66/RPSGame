package com.rpsGame.game.inGame;

import com.rpsGame.game.inGame.display.strings.RPSGameStrings;

public class InGameChoice {

    private int rpsPlayerChoiceInt = 0;
    private int numberOfOptions;
    private boolean isOptionInteger;


    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    InGameChoiceInfoLogic inGameChoiceInfoLogic = new InGameChoiceInfoLogic
            (
                    false,
                    false,
                    false
            );
    InGameChoiceInfo inGameChoiceInfo = new InGameChoiceInfo
            (
                    0,
                    "",
                    inGameChoiceInfoLogic
            );

    public boolean isOptionInteger(char rpsPlayerChoiceChar) {
        try {
            rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
            isOptionInteger = true;
        } catch (Exception a) {
            System.out.println("Exception: " + a);
            isOptionInteger = false;
        }
        return isOptionInteger;
    }

    public InGameChoiceInfo runInGameChoice(int gameVersion, char rpsPlayerChoiceChar) {

        if (gameVersion == 1) {
            numberOfOptions = 3;
        } else if (gameVersion == 2) {
            numberOfOptions = 5;
        }

        isOptionInteger = isOptionInteger(rpsPlayerChoiceChar);
        inGameChoiceInfoLogic.setIsOptionInteger(isOptionInteger);

        if (isOptionInteger) {
            if (rpsPlayerChoiceInt <= numberOfOptions) {
                String playerChoiceString;
                switch (rpsPlayerChoiceChar) {
                    case '1':
                        playerChoiceString = rpsGameStrings.ROCK_STRING;
                        inGameChoiceInfo.setPlayerChoiceString(playerChoiceString);
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        inGameChoiceInfo.setRpsPlayerChoiceInt(rpsPlayerChoiceInt);
                        break;
                    case '2':
                        playerChoiceString = rpsGameStrings.PAPER_STRING;
                        inGameChoiceInfo.setPlayerChoiceString(playerChoiceString);
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        inGameChoiceInfo.setRpsPlayerChoiceInt(rpsPlayerChoiceInt);
                        break;
                    case '3':
                        playerChoiceString = rpsGameStrings.SCISSORS_STRING;
                        inGameChoiceInfo.setPlayerChoiceString(playerChoiceString);
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        inGameChoiceInfo.setRpsPlayerChoiceInt(rpsPlayerChoiceInt);
                        break;
                    case '4':
                        playerChoiceString = rpsGameStrings.SPOCK_STRING;
                        inGameChoiceInfo.setPlayerChoiceString(playerChoiceString);
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        inGameChoiceInfo.setRpsPlayerChoiceInt(rpsPlayerChoiceInt);
                        break;
                    case '5':
                        playerChoiceString = rpsGameStrings.LIZARD_STRING;
                        inGameChoiceInfo.setPlayerChoiceString(playerChoiceString);
                        rpsPlayerChoiceInt = Integer.parseInt(String.valueOf(rpsPlayerChoiceChar));
                        inGameChoiceInfo.setRpsPlayerChoiceInt(rpsPlayerChoiceInt);
                        break;
                    default:
                        inGameChoiceInfo.repeatInGameChoice();
                }
            } else if (rpsPlayerChoiceInt > numberOfOptions) {
                inGameChoiceInfo.repeatInGameChoice();
                return inGameChoiceInfo;
            }
        } else {
            switch (rpsPlayerChoiceChar) {
                case 'n':
                    inGameChoiceInfoLogic.setIsReset(true);
                    break;
                case 'x':
                    inGameChoiceInfoLogic.setIsExit(true);
                    break;
                default:
                    inGameChoiceInfo.repeatInGameChoice();
                    break;
            }
        }
        return inGameChoiceInfo;
    }
}
