package CodingBat.Array1;

import java.util.Arrays;

public class MakeMiddle {

    public static int[] makeMiddle(int[] nums) {
        int[] mid = new int[2];
        if (nums.length >= 2 && nums.length % 2 == 0) {
            mid[0] = nums[nums.length / 2 - 1];
            mid[1] = nums[nums.length / 2];
        } else {
            System.out.println("ERROR");
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));
    }

}
