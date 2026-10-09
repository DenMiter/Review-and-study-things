package FirstTasks;

public class SImpleNums {

    public static void main(String[] args) {

        int[] arr = new int[99];

        for (int i = 0; i < 99; i++) {
            arr[i] = i + 2;
        }

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

    }

}
