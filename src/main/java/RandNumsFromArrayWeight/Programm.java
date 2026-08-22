package RandNumsFromArrayWeight;

public class Programm {

    public static void main(String[] args) {

        System.out.println();

        RandNumArrWeight rnaw = new RandNumArrWeight();

        int[] nums = rnaw.fillArrNums(3);
        int[] weights = rnaw.fillArrWeights(3);
        int res1 = rnaw.getRandNum();
        int res2 = rnaw.getRandNum();
        int res3 = rnaw.getRandNum();
        int res4 = rnaw.getRandNum();

        System.out.print("Числа ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.print("Веса ");
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }

        System.out.println();
        System.out.println("Результат " + res1);
        System.out.println("Результат " + res2);
        System.out.println("Результат " + res3);
        System.out.println("Результат " + res4);

    }

}
