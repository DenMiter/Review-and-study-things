package CodingBat.String2;

public class XyzMiddle {

    public static boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        String sub1 = str.substring(0, str.indexOf("xyz"));
        String sub2 = str.substring(str.lastIndexOf("xyz") + 3);
        if (sub1.length() == sub2.length()) {
            return true;
        } else if (sub1.length() - sub2.length() == 1) {
            return true;
        } else if (sub2.length() - sub1.length() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
        System.out.println(xyzMiddle("AAxyzBBB"));
        System.out.println(xyzMiddle("AxyzB"));
        System.out.println(xyzMiddle("xyz"));
        System.out.println(xyzMiddle("ABBB"));
    }

}
