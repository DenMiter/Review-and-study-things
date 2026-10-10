package CodingBat.WarmUp1;

public class NearHundred {

    public static boolean nearHundred(int n) {
        boolean res;
        if (n <= 100 && n >= 90 || n <= 200 && n >= 190) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(193));
        System.out.println(nearHundred(190));
        System.out.println(nearHundred(189));
    }

}
