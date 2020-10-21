package com.undervisning.car;

public class BreakPedal {
    protected Boolean pedalDown = false;

    public void pushPedal() {
        this.pedalDown = true;
    }
    public void liftPedal() {
        this.pedalDown = false;
    }
}
