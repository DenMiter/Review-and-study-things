package Homemade;

public class FactorialRecursion {

    public static int findFactrorial(int f) {
        if (f == 1 || f == 0) {
            return 1;
        }
        return f * findFactrorial(f - 1);
    }

    public static void main(String[] args) {
        System.out.println(findFactrorial(0));
        System.out.println(findFactrorial(1));
        System.out.println(findFactrorial(2));
        System.out.println(findFactrorial(3));
        System.out.println(findFactrorial(5));
        System.out.println(findFactrorial(19));
    }

}
