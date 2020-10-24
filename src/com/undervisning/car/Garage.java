package com.undervisning.car;

import java.util.*;
import java.util.stream.IntStream;

enum Garage {
    MyGarage;
    ArrayList<Car> carList = new ArrayList<>();


    void generateCars(Brand brand, Color color, int amount) {
        IntStream.range(0, amount).forEach(car -> carList.
                add(new Car(brand, color)));
    }
    void turnCarsOn(Color color, Brand brand) {
        carList.stream().filter(car -> car.color == color && car.brand == brand).forEach(Car::turnEngineOn);
    }
    void turnCarsOff(Color color, Brand brand) {
        carList.stream().filter(car -> car.color == color && car.brand == brand).forEach(Car::turnEngineOff);
    }
    void turnCarsOn(Brand brand){
        carList.stream().filter(car -> car.brand == brand).forEach(Car::turnEngineOn);
    }

    void turnCarsOff(Brand brand) {
        carList.stream().filter(car -> car.brand == brand).forEach(Car::turnEngineOff);
    }
    void turnCarsOn(Color color){
        carList.stream().filter(car -> car.color == color).forEach(Car::turnEngineOn);
    }
    void turnCarsOff(Color color) {
        carList.stream().filter(car -> car.color == color).forEach(Car::turnEngineOff);
    }



    public static void main(String[] args) {
        MyGarage.generateCars(Brand.KIA, Color.BLACK, 10);
        MyGarage.generateCars(Brand.MERCEDES, Color.BLUE, 11);
        MyGarage.turnCarsOn(Color.BLUE);
        MyGarage.turnCarsOff(Color.BLUE);
        MyGarage.turnCarsOff(Color.BLACK);

        MyGarage.turnCarsOn(Color.BLACK);
        for (Car car: MyGarage.carList
             ) {
            car.dashboard.isEngineOn(car);
            car.dashboard.printSpeed(car);
        }
    }
}
