package CodingBat.Array1;

import java.util.Arrays;

public class RotateLeft3 {

    public static int[] rotateLeft3(int[] nums) {
        int[] rev = new int[nums.length];
        rev[0] = nums[1];
        rev[1] = nums[2];
        rev[2] = nums[0];
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(rotateLeft3(new int[]{7, 0, 0})));
    }

}
