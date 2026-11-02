package CodingBat.String2;

public class CountHi {

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

        System.out.println(countHi("ab fdfsdfchi fdsfdshi fdsfhohihihi"));
        System.out.println(countHi("ABCh i dfdsfsdfsdffhihidshi"));
        System.out.println(countHi("hihihihihihih"));
    }

}
