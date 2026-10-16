package CodingBat.String1;

public class MinCat {

    public static String minCat(String a, String b) {
        String res;
        if (a.length() > b.length()) {
            a = a.substring(a.length() - b.length());
            res = a + b;
        } else {
            b = b.substring(b.length() - a.length());
            res = a + b;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
}
