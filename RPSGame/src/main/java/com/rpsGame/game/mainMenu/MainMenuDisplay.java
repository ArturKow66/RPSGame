package com.rpsGame.game.mainMenu;

import com.rpsGame.KeyboardReader;
import com.rpsGame.game.mainMenu.strings.MainMenuOptionsStrings;

public class MainMenuDisplay {

    public int chosenOption;

    MainMenuOptionsStrings mainMenuOptionsStrings = new MainMenuOptionsStrings();
    KeyboardReader keyboardReader = new KeyboardReader();

    public MainMenuDisplay(int chosenOption) {
        this.chosenOption = chosenOption;
    }

    public int runMainMenu() {
        boolean isOptionChosen = false;
        while (!isOptionChosen) {
            System.out.println("\n" + " -*****- " + "\n" + mainMenuOptionsStrings.WELCOME_STRING);

            while (!isOptionChosen) {
                System.out.println(
                        mainMenuOptionsStrings.OPTION_NEW_GAME_STRING + "\n" +
                                mainMenuOptionsStrings.OPTION_NEW_GAME_SPOCK_STRING + "\n" +
                                mainMenuOptionsStrings.OPTION_EXIT_STRING + "\n"
                );

                try{
                    MainMenuDisplay.this.chosenOption = Integer.parseInt(keyboardReader.readKeyboard());
                } catch (NumberFormatException a){
                    System.out.println("Exception: " +a);
                }

                switch (chosenOption) {
                    case 1:
                    case 2:
                        System.out.println("\n" + mainMenuOptionsStrings.NEW_PLAYER_STRING);
                        isOptionChosen = true;
                        break;
                    case 3:
                        System.out.println("\n" + mainMenuOptionsStrings.EXIT_GAME_STRING);
                        isOptionChosen = true;
                        break;
                    default:
                        System.out.println("\n" + mainMenuOptionsStrings.CHOICE_STRING);
                }
            }
        }
        return chosenOption;
    }
}
