package Exercism.ToyCarClasses;

public class Main {

    public static void main(String[] args) {
        ToyCar car1 = ToyCar.buy();

        int i = 0;
        while (i < 101) {
            car1.drive();
            i++;
            car1.distanceDisplay();
            car1.batteryDisplay();
        }

    }

}
