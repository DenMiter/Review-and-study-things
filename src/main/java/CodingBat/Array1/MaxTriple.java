package CodingBat.Array1;

public class MaxTriple {

    public static int maxTriple(int[] nums) {
        int max = nums[0];
        if (nums[nums.length / 2] > max) {
            max = nums[nums.length / 2];
        }
        if (nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1, 2, 3}));
        System.out.println(maxTriple(new int[]{1, 5, 3}));
        System.out.println(maxTriple(new int[]{5, 2, 3}));
    }

}
