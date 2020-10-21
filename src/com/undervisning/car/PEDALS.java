package com.undervisning.car;

public enum PEDALS {
    ACCELERATOR_PEDAL, BREAK_PEDAL;
    protected Boolean pedalDown = false;

    public void pushPedal() {
        this.pedalDown = true;
    }
    public void liftPedal() {
        this.pedalDown = false;
    }
}
