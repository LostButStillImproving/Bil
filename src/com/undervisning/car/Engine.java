package com.undervisning.car;

public class Engine {
    private Boolean isOn = false;
    Speed speed = Speed.DEAD;
    RPM rpm = RPM.DEAD;
    AcceleratorPedal acceleratorPedal;

    public boolean isEngineOn() {
        if (isOn) {
            System.out.println("ON!");
        } else {
            System.out.println("OFF");
        }
        return isOn;
    }
    public void TurnEngineOff() {
        if (this.isOn) {
            System.out.println("Engine OFF");
            this.isOn = false;
        } else {
            System.out.println("Engine ALREADY OFF");
        }
    }
    public void start(String keyCode) {
        if (!isOn) {
            if ((keyCode.equals("hunter123"))) {
                this.isOn = true;
                System.out.println("Engine ON!");
            } else {
                System.out.println("Wrong keycode");
            }
        } else {
            System.out.println("Engine ALREADY ON");
        }
    }
    public void increaseCurrentSpeed() {
        switch (speed){
            case DEAD -> this.speed = Speed.SLOW;
            case SLOW -> this.speed = Speed.MEDIUM;
            case MEDIUM -> this.speed = Speed.FAST;
        }
    }

    public void decreaseCurrentSpeed() {
        switch (speed){
            case FAST -> this.speed = Speed.MEDIUM;
            case MEDIUM -> this.speed = Speed.SLOW;
            case SLOW -> this.speed = Speed.DEAD;
        }
    }

    public RPM getRPM() {
        return this.rpm;
    }

    public Speed getSpeed() {
        return speed;
    }
}
