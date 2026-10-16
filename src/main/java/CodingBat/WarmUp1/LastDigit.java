package CodingBat.WarmUp1;

public class LastDigit {

    public static boolean lastDigit(int a, int b) {
        boolean res;
        if (a % 10 == b % 10) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }

}
