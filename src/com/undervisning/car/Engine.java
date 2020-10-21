package com.undervisning.car;

public class Engine {
    Boolean isOn = false;
    Double RPM = 0.;
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
}
