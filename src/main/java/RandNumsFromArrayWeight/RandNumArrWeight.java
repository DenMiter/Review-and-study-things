package RandNumsFromArrayWeight;

import java.util.Random;

public class RandNumArrWeight {

    private int[] nums;
    private int[] weights;
    private int sumWeights = 0;
    private Random random = new Random();

    public int[] fillArrNums(int n) {
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(10);
        }
        return nums;
    }

    public int[] fillArrWeights(int n) {
        sumWeights = 0;
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = random.nextInt(10);
            sumWeights += weights[i];
        }
        return weights;
    }

    public int getRandNum() {
        int n = random.nextInt(sumWeights);
        for (int i = 0; i < weights.length; i++) {
            n -= weights[i];
            if (n < 0) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
