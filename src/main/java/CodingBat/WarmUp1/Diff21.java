package CodingBat.WarmUp1;

public class Diff21 {

    public static int diff21(int n) {
        int res;
        if (n <= 21) {
            res = 21 - n;
        } else {
            res = (21 - n) * 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(99));
    }

}
