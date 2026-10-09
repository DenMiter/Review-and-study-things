package FirstTasks;

public class MaxMinAverage {

    public static double max;
    public static double min;
    public static double avg;
    public static double average;

    public static void main(String[] args) {
        double[] arr = new double[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Math.random() * 10;
        }

        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < 9; i++) {
            avg += arr[i];
        }
        average = avg / arr.length;

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\n" + "\n" + max + " " + min + " " + average);
    }

}