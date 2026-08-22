package BinarySearch;

public class Program {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch();

        int[] arr1 = bs.FillArray(1_022_000_000);

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + "  ");
//        }
//        System.out.println();
        System.out.println();

        long time1 = System.currentTimeMillis();
        bs.SearchInArrayForward(55, arr1);
        System.out.println(System.currentTimeMillis() - time1 + " мс");
        System.out.println();

        long time2 = System.currentTimeMillis();
        bs.SearchInArrayBackward(55, arr1);
        System.out.println(System.currentTimeMillis() - time2 + " мс");
        System.out.println();

        long time3 = System.currentTimeMillis();
        bs.binarySearchInArray(55, arr1);
        System.out.println(System.currentTimeMillis() - time3 + " мс");
        System.out.println();
        System.out.println();

    }

}
