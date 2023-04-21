package org.example;

public class NeedForSpeed {
    int speed;
    int batteryDrain;
    int meters;
    int battery;

    public static void main(String[] args) {
    }


    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.meters = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if(battery > 0){
            meters += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        int batterySections = 100 / car.batteryDrain;
        int maxDistance = batterySections * car.speed;
        return maxDistance >= distance;
    }
}