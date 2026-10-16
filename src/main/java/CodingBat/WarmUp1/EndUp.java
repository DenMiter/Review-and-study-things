package CodingBat.WarmUp1;

public class EndUp {

    public static String endUp(String str) {
        String upper;
        String res;
        if (str.length() > 3) {
            upper = str.toUpperCase();
            res = str.substring(0, str.length() - 3) + upper.substring(str.length() - 3);
        } else {
            res = str.toUpperCase();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }

}
