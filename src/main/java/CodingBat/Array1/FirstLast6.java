package CodingBat.Array1;

public class FirstLast6 {

    public static boolean firstLast6(int[] nums) {
        boolean res = false;
        if (nums.length >= 1) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                res = true;
            }
        } else {
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(firstLast6(new int[]{1, 2, 6}));
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));
        System.out.println(firstLast6(new int[]{6, 2, 6}));
    }

}
