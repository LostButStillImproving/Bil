package com.undervisning.car;

public class Engine {
    private Boolean isOn = false;
    private Speed speed = Speed.DEAD;
    private RPM rpm = RPM.DEAD;

    public boolean isEngineOn() {
        if (isOn) {
            return true;
        } else {
            return false;
        }
    }
    public void TurnEngineOff() {
        if (this.isOn) {
            System.out.println("Engine OFF");
            this.isOn = false;
            this.rpm = RPM.DEAD;
        } else {
            System.out.println("Engine ALREADY OFF");
        }
    }
    public void turnEngineOn(String keyCode) {
        if (!isOn) {
            if ((keyCode.equals(keyCode))) {
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
        if (isEngineOn()){
            switch (this.speed){
                case DEAD -> this.speed = Speed.SLOW;
                case SLOW -> this.speed = Speed.MEDIUM;
                case MEDIUM -> this.speed = Speed.FAST;
            }
        }

    }
    public void decreaseCurrentSpeed() {
        switch (this.speed){
            case FAST -> this.speed = Speed.MEDIUM;
            case MEDIUM -> this.speed = Speed.SLOW;
            case SLOW -> this.speed = Speed.DEAD;
        }
    }
    public void increaseRPM(){
        if (isEngineOn()){
            switch (this.rpm){
                case DEAD -> this.rpm = RPM.LOW;
                case LOW -> this.rpm = RPM.MEDIUM;
                case MEDIUM -> this.rpm = RPM.HIGH;
            }
        }
    }
    public void decreaseRPM(){
        switch (this.rpm){
            case HIGH -> this.rpm = RPM.MEDIUM;
            case MEDIUM -> this.rpm = RPM.LOW;
            case LOW -> this.rpm = RPM.DEAD;
        }
    }

    public RPM getRPM() {
        return this.rpm;
    }

    public Speed getSpeed() {
        return this.speed;
    }
}
