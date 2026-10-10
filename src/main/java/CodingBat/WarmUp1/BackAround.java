package CodingBat.WarmUp1;

public class BackAround {

    public static String backAround(String str) {
        String res = "";
        if (!str.isEmpty()) {
            res = str.substring(str.length() - 1) + str.substring(0, str.length()) + str.substring(str.length() - 1);
        } else {
            System.out.print("Введи ченить");
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "cat";
        System.out.println(backAround(str));
    }

}
