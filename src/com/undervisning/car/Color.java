package com.undervisning.car;

public enum Color {
    BLUE, BLACK, ORANGE, PINK;

    public void printColor(){
        System.out.println(Color.valueOf(this.name()));
    }
}
