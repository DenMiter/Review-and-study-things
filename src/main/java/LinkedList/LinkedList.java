package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(E item) {
            this.item = item;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public boolean add(E item) {
        Node<E> newNode = new Node<>(item);

        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
        return true;
    }

    public E get(int index) {
        checkIndex(index);

        Node<E> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.item;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public void addFirst(E item) {
        Node<E> newNode = new Node<>(item);

        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }

    public void addLast(E item) {
        add(item);
    }

    public E getFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public E getLast() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return last.item;
    }

    public E removeFirst() {
        if (size == 0) {
            throw new java.util.NoSuchElementException();
        }

        E value = first.item;
        first = first.next;
        size--;

        if (size == 0) {
            last = null;
        } else {
            first.prev = null;
        }
        return value;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("( ");
        Node<E> current = first;

        while (current != null) {
            sb.append(current.item);

            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append(" )");
        return sb.toString();
    }


}
