package CodingBat.String1;

public class MakeTags {

    public static String makeTags(String tag, String word) {
        String res = "<" + tag + ">" + word + "</" + tag + ">";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
    }

}
