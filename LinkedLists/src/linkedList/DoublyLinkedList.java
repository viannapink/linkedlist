package linkedList;

import main.Main;

public class DoublyLinkedList<T> {
    private class Node<T> {
        T data;
        Node next;
        Node previous;
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private Node head;
    private Node tail;
    private int length;

    public void addFirst(T data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            tail = node;
        }

        else {
            head.previous = node;
        }

        node.next = head;
        head = node;
        length++;

        Main.showProgress(toString());
    }

    public void addAt(int index, T data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            addFirst(data);
        }

        else if (index == length - 1) {
            addLast(data);
        }

        else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            temp.previous.next = node;
            node.next = temp;

            length++;

            Main.showProgress(toString());
        }
    }

    public void addLast(T data) {
        Node node = new Node();
        node.data = data;

        if (isEmpty()) {
            head = node;
        }

        else {
            tail.next = node;
        }

        node.previous = tail;
        tail = node;

        length++;

        Main.showProgress(toString());
    }

    public void removeFirst() {
        head = head.next;
        length--;

        System.out.println(toString());
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        }
        else if (index == length - 1) {
            removeLast();
        }
        else {
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.previous = temp;

            length--;
            Main.showProgress(toString());
        }
    }

    public void removeLast() {
        if (length != 1) {
            tail = tail.previous;
            tail.next = null;

            length--;
            Main.showProgress(toString());
        }

        else {
            removeFirst();
        }
    }

    public String toString() {
        String tempString = "[";
        Node temp = head;

        if (!isEmpty()) {
            while (temp.next != null) {
                tempString += temp.data + ", ";
                temp = temp.next;
            }
            tempString += temp.data + "]";
        }

        return tempString;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }
}