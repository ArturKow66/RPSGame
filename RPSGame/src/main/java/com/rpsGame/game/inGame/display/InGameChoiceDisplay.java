package com.rpsGame.game.inGame.display;

import com.rpsGame.game.inGame.display.strings.RPSGameStrings;

import java.util.Random;

public class InGameChoiceDisplay {

    private int noOptions;
    private String computerChoice;

    RPSGameStrings rpsGameStrings = new RPSGameStrings();
    Random random = new Random();

    public int runInGameChoiceDisplay(int gameVersion, String playerChoice) {

        if (gameVersion == 1) {
            noOptions = 3;
        } else if (gameVersion == 2) {
            noOptions = 5;
        }

        int rpsComputerChoiceInt = random.nextInt(noOptions) + 1;

        switch (rpsComputerChoiceInt) {
            case 1:
                computerChoice = rpsGameStrings.ROCK_STRING;
                System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                break;
            case 2:
                computerChoice = rpsGameStrings.PAPER_STRING;
                System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                break;
            case 3:
                computerChoice = rpsGameStrings.SCISSORS_STRING;
                System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                break;
            case 4:
                computerChoice = rpsGameStrings.SPOCK_STRING;
                System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                break;
            case 5:
                computerChoice = rpsGameStrings.LIZARD_STRING;
                System.out.println(rpsGameStrings.YOUR_CHOICE_STRING + playerChoice + rpsGameStrings.COMPUTER_CHOICE_STRING + computerChoice);
                break;
            default:
                break;
        }
        return rpsComputerChoiceInt;
    }
}
