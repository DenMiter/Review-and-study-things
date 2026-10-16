package CodingBat.String1;

public class ConCat {

    public static String conCat(String a, String b) {
        String res;
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) {
            b = b.substring(1);
        }
        res = a + b;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
        System.out.println(conCat("abc", "cda"));
        System.out.println(conCat("aaa", "aaa"));
        System.out.println(conCat("", "aaa"));
    }

}
