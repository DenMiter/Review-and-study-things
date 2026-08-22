package FirstTasks;

public class BubbleSort {

    public static int[] array = {2,32,325,45,6,7,8,2,4,5,6,78,43,5,35,6,7,88,8};

    public static void main(String[] args) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
