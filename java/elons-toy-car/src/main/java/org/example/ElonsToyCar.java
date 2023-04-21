package org.example;

public class ElonsToyCar {
    int meters = 0;
    int battery = 100;

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        for (int i = 0; i < 100; i++) {
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if (battery > 0)
            return "Battery at " + battery + "%";
        else
            return "Battery empty";
    }

    public void drive() {
        if (battery >= 0 && meters < 2000) {
            meters += 20;
            battery -= 1;
        }
    }
}