package com.undervisning.car;

public enum Brand {
    TOYOTA, MERCEDES, KIA;

    void printBrand() {
        System.out.println(Brand.valueOf(this.name()));
    }
}
