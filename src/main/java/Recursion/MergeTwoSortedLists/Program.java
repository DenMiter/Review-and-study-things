package Recursion.MergeTwoSortedLists;

public class Program {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.setNext(new ListNode(8));
        list1.getNext().setNext(new ListNode(25));

        ListNode list2 = new ListNode(2);
        list2.setNext(new ListNode(7));
        list2.getNext().setNext(new ListNode(16));


        ListNode merger = new ListNode();

        ListNode result = merger.mergeTwoLists(list1, list2);


        ListNode current = result;

        while (current != null) {
            System.out.print(current.getVal() + " ");
            current = current.getNext();
        }


    }


}
