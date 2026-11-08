package Exercism.NFS;

public class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }

}
