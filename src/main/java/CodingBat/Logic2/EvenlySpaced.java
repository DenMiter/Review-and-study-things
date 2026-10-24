package CodingBat.Logic2;

public class EvenlySpaced {

    public static boolean evenlySpaced(int a, int b, int c) {
        int max = a;
        int min = a;
        int mid;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        mid = (a + b + c) - max - min;

        return (max - mid) == (mid - min);
    }

    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
        System.out.println(evenlySpaced(4, 6, 2));
        System.out.println(evenlySpaced(4, 6, 3));
        System.out.println(evenlySpaced(6, 4, 2));
        System.out.println(evenlySpaced(6, 2, 4));
    }

}
