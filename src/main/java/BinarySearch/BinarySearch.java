package BinarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    Random random = new Random();

    public int[] FillArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        Arrays.sort(arr);
        return arr;
    }

    public void SearchInArrayForward(int n, int[] arr) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Элемент " + n + " найден на позиции " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Элемент " + n + " не найден в массиве");
        }
    }

    public void SearchInArrayBackward(int n, int[] arr) {
        boolean isFound = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == n) {
                System.out.println("Элемент " + n + " найден на позиции " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Элемент " + n + " не найден в массиве");
        }
    }

    public int binarySearchInArray(int n, int[] arr) {
        return binarySearchInArray(arr, n, 0, arr.length - 1);
    }

    public int binarySearchInArray(int[] arr, int n, int left, int right) {

        if (right < left) {
            System.out.println("Элемент " + n + " не найден в массиве");
            return -1;
        }

        int middle = (left + right) / 2;

        if (n == arr[middle]) {
            System.out.println("Элемент " + n + " найден на позиции " + middle);
            return middle;
        } else if (n < arr[middle]) {
            return binarySearchInArray(arr, n, left, middle - 1);
        } else {
            return binarySearchInArray(arr, n, middle + 1, right);
        }

    }


}
