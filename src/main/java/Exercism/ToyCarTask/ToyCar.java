package Exercism.ToyCarTask;

public class ToyCar {

    private int distance;
    private int battery;

    public ToyCar() {
        this.distance = 0;
        this.battery = 100;
    }

    public static ToyCar buy() {
        return new ToyCar();
    }

    public void distanceDisplay() {
        System.out.println("Driven " + distance + " meters");
    }

    public void batteryDisplay() {
        System.out.println("Battery at " + battery + "%");
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        } else {
            System.out.println("Battery empty");
        }
    }

}
