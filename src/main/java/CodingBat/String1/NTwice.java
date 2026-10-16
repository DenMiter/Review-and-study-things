package CodingBat.String1;

public class NTwice {

    public static String nTwice(String str, int n) {
        String subStart = str.substring(0, n);
        String subEnd = str.substring(str.length() - n, str.length());
        String res = subStart + subEnd;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }

}
