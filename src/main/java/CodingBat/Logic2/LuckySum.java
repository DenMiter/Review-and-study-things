package CodingBat.Logic2;

public class LuckySum {

    public static int luckySum(int a, int b, int c) {
        int res = 0;
        if (a != 13 && b != 13 && c != 13) {
            res = a + b + c;
        } else if (a == 13) {
            res = 0;
        } else if (b == 13) {
            res = a;
        } else if (c == 13) {
            res = a + b;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
    }

}
