package CodingBat.WarmUp1;

public class MissingChar {

    public static String missingChar(String str, int n) {
        String res = "";
        if (n >= 0 && n <= str.length() - 1) {
            res = str.substring(0, n) + str.substring(n + 1, str.length());
        } else {
            System.out.print("n вне допустимого диапазона");
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "ABCDE";
        System.out.println(missingChar(str, 0));
        System.out.println(missingChar(str, 1));
        System.out.println(missingChar(str, 2));
        System.out.println(missingChar(str, 3));
        System.out.println(missingChar(str, 4));
        System.out.println(missingChar(str, 9999));
        System.out.println(missingChar(str, -1));
    }

}
