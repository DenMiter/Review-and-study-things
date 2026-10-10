package CodingBat.WarmUp1;

public class StartHi {

    public static boolean startHi(String str) {
        boolean res;
        boolean oneTwo = str.startsWith("hi");
        if (oneTwo) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi(" hi ffff"));
        System.out.println(startHi("thhfjdhfd hi"));
        System.out.println(startHi("ehi"));
        System.out.println(startHi("hihihihihihih"));
    }

}
