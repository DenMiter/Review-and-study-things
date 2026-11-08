package Exercism.NFS;

public class RaceTrack {

    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public void canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();
        }
        car.distanceDriven();
    }

}
