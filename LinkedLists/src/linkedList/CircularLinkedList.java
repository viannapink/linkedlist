package linkedList;

import main.Main;

public class CircularLinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;
    }

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private Node head;
    private Node tail;
    private int length;

    public void addLast(T data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            head = node;
            tail = node;
            node.next = head;
        }

        else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }

        length++;

        Main.showProgress(toString());
    }

    public void deleteLast() {
        if (length == 1) {
            head = null;
            tail = null;
        }

        else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            tail = temp;
            tail.next = head;
        }

        length--;

        Main.showProgress(toString());
    }

    public String toString() {
        Node temp = head;
        String tempString = "[";

        if (!isEmpty()) {
            while (temp != tail) {
                tempString += temp.data + ", ";
                temp = temp.next;
            }
            tempString += temp.data;
        }

        tempString += "]";

        return tempString;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

}