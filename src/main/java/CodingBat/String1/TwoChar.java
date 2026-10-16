package CodingBat.String1;

public class TwoChar {

    public static String twoChar(String str, int index) {
        if (index > str.length() - 2) {
            str = str.substring(0, 2);
        } else {
            str = str.substring(index, index + 2);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

}
