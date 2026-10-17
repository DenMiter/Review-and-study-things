package CodingBat.Array1;

public class Sum3 {

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum3(new int[]{1, 2, 3}));
        System.out.println(sum3(new int[]{5, 11, 2}));
        System.out.println(sum3(new int[]{7, 0, 0}));
    }

}
