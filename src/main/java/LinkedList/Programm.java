package LinkedList;

public class Programm {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);

        linkedList.get(0);
        linkedList.get(1);
        linkedList.get(4);

        linkedList.size();
        linkedList.isEmpty();

        linkedList.addFirst(11);
        linkedList.addLast(22);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.removeFirst();

        System.out.println(linkedList);

        linkedList.clear();

        System.out.println(linkedList);


        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();

        linkedList2.add(6);
        linkedList2.add(7);
        linkedList2.add(8);
        linkedList2.add(9);
        linkedList2.add(10);

        System.out.println(linkedList2);

        linkedList2.get(0);
        linkedList2.get(1);
        linkedList2.get(4);

        linkedList2.size();
        linkedList2.isEmpty();

        linkedList2.addFirst(33);
        linkedList2.addLast(44);
        linkedList2.getFirst();
        linkedList2.getLast();
        linkedList2.removeFirst();

        System.out.println(linkedList2);

        linkedList2.clear();

        System.out.println(linkedList2);

    }

}
