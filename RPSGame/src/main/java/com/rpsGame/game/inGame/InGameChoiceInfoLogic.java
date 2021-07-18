package com.rpsGame.game.inGame;

public class InGameChoiceInfoLogic {

    private boolean isReset;
    private boolean isExit;
    private boolean isOptionInteger;


    public InGameChoiceInfoLogic
            (
                    boolean isReset,
                    boolean isExit,
                    boolean isOptionInteger
            ) {
        this.isReset = isReset;
        this.isExit = isExit;
        this.isOptionInteger = isOptionInteger;
    }

    public boolean isReset() {
        return isReset;
    }

    public void setIsReset(boolean reset) {
        isReset = reset;
    }

    public boolean isExit() {
        return isExit;
    }

    public void setIsExit(boolean exit) {
        isExit = exit;
    }

    public boolean isOptionInteger() {
        return isOptionInteger;
    }

    public void setIsOptionInteger(boolean optionInteger) {
        isOptionInteger = optionInteger;
    }
}
