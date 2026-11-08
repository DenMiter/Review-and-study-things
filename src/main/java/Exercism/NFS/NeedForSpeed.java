package Exercism.NFS;

public class NeedForSpeed {

    private final int speed;
    private final int batteryDrain;

    private int drivenDistance;
    private int battery;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.drivenDistance = 0;
        this.battery = 100;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public void drive() {
        if (batteryDrained()) {
            return;
        }
        drivenDistance += speed;
        battery -= batteryDrain;
    }

    public int distanceDriven() {
        System.out.println(drivenDistance);
        return drivenDistance;
    }

    public boolean batteryDrained() {
        return battery - batteryDrain < 0;
    }

}
