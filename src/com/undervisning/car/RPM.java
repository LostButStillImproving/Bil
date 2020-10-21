package com.undervisning.car;

public enum RPM {
    DEAD(0), LOW(100), MEDIUM(500), HIGH(1000);

    RPM(int RPM) {
    }


    public int getRPM() {
        return this.ordinal();
    }
}
