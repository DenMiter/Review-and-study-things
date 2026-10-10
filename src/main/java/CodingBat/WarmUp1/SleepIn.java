package CodingBat.WarmUp1;

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean res = false;
        if (!weekday || vacation) {
            res = true;
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println(sleepIn(true, true));
    }

}
