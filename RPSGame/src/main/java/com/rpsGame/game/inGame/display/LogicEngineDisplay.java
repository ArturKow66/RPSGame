package com.rpsGame.game.inGame.display;

import com.rpsGame.game.inGame.display.strings.RPSGameStrings;

public class LogicEngineDisplay {

    private int winner;

    RPSGameStrings rpsGameStrings = new RPSGameStrings();

    public int runLogicEngine(int rpsPlayerChoiceInt, int rpsComputerChoiceInt) {

        switch (rpsPlayerChoiceInt) {
            case 1:
                switch (rpsComputerChoiceInt) {
                    case 1:
                        System.out.println(rpsGameStrings.TIE_STRING);
                        winner = 0;
                        break;
                    case 2:
                    case 4:
                        System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                        winner = 2;
                        break;
                    case 3:
                    case 5:
                        System.out.println(rpsGameStrings.YOU_WIN_STRING);
                        winner = 1;
                        break;
                }
                break;

            case 2:
                switch (rpsComputerChoiceInt) {
                    case 1:
                    case 4:
                        System.out.println(rpsGameStrings.YOU_WIN_STRING);
                        winner = 1;
                        break;
                    case 2:
                        System.out.println(rpsGameStrings.TIE_STRING);
                        winner = 0;
                        break;
                    case 3:
                    case 5:
                        System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                        winner = 2;
                        break;
                }
                break;

            case 3:
                switch (rpsComputerChoiceInt) {
                    case 1:
                    case 4:
                        System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                        winner = 2;
                        break;
                    case 2:
                    case 5:
                        System.out.println(rpsGameStrings.YOU_WIN_STRING);
                        winner = 1;
                        break;
                    case 3:
                        System.out.println(rpsGameStrings.TIE_STRING);
                        winner = 0;
                        break;
                }
                break;

            case 4:
                switch (rpsComputerChoiceInt) {
                    case 1:
                    case 3:
                        System.out.println(rpsGameStrings.YOU_WIN_STRING);
                        winner = 1;
                        break;
                    case 2:
                    case 5:
                        System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                        winner = 2;
                        break;
                    case 4:
                        System.out.println(rpsGameStrings.TIE_STRING);
                        winner = 0;
                        break;
                }
                break;

            case 5:
                switch (rpsComputerChoiceInt) {
                    case 1:
                    case 3:
                        System.out.println(rpsGameStrings.COMPUTER_WINS_STRING);
                        winner = 2;
                        break;
                    case 2:
                    case 4:
                        System.out.println(rpsGameStrings.YOU_WIN_STRING);
                        winner = 1;
                        break;
                    case 5:
                        System.out.println(rpsGameStrings.TIE_STRING);
                        winner = 0;
                        break;
                }
                break;
        }
        return winner;
    }
}
