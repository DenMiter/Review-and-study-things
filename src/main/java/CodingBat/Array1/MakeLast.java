package CodingBat.Array1;

import java.util.Arrays;

public class MakeLast {

    public static int[] makeLast(int[] nums) {
        int newSize = nums.length * 2;
        int[] ext = new int[newSize];

        for (int i = 0; i < newSize - 1; i++) {
            ext[i] = 0;
        }

        ext[newSize - 1] = nums[nums.length - 1];
        return ext;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[]{1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[]{3})));
    }

}