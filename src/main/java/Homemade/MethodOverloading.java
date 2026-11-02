package Homemade;

public class MethodOverloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 4));
        System.out.println(sum(1.5, 4.5));
    }

}
