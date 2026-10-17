package CodingBat.Array1;

import java.util.Arrays;

public class Reverse3 {

    public static int[] reverse3(int[] nums) {
        int[] rev = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rev[i] = nums[nums.length - 1 - i];
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(reverse3(new int[]{7, 0, 0})));
    }

}
