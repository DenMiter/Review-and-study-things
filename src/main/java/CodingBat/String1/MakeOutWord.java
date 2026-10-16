package CodingBat.String1;

public class MakeOutWord {

    public static String makeOutWord(String out, String word) {
        String res;
        res = out.substring(0, 2) + word + out.substring(2);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }

}
