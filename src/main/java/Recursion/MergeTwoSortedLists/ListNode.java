package Recursion.MergeTwoSortedLists;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // условие выхода (базис)
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.getVal() < list2.getVal()) {
            list1.setNext(mergeTwoLists(list1.getNext(), list2));
            return list1;
        } else {
            list2.setNext(mergeTwoLists(list1, list2.getNext()));
            return list2;
        }

    }

}

