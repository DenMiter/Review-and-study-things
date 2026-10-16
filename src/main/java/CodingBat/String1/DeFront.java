package CodingBat.String1;

public class DeFront {

    public static String deFront(String str) {
        String res = "";
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            res = str.substring(0, 2) + str.substring(2);
        } else if (str.charAt(0) == 'a') {
            res = str.substring(0, 1) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            res = str.substring(1, 2) + str.substring(2);
        } else if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
            res = str.substring(2);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println();
        System.out.println(deFront("aHello"));
        System.out.println(deFront("jbava"));
        System.out.println(deFront("abway"));
        System.out.println(deFront("ababway"));
    }

}
