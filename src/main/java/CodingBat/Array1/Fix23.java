package CodingBat.Array1;

import java.util.Arrays;

public class Fix23 {

    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(fix23(new int[]{2, 3, 5})));
        System.out.println(Arrays.toString(fix23(new int[]{1, 2, 1})));
    }

}
