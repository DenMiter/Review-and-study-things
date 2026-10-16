package CodingBat.String1;

public class StartWord {

    public static String startWord(String str, String word) {
        String res;
        String sub = str.substring(0, word.length());
        String subTail = sub.substring(1);
        String wwf = word.substring(1);
        if (sub.equals(word)) {
            res = sub;
        } else if (subTail.equals(wwf)) {
            res = sub;
        } else {
            res = "";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }

}
