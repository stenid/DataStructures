package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;


    // addFirst

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    // addLast

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;

        else {
            last.next = node;
            last = node;
        }

    }

    // removeFirst

    public void removeFirst () {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    // removeLast

    public void removeLast () {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious (Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    // contains

    public boolean contains (int item) {
        return indexOf(item) != -1;
    }

    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
