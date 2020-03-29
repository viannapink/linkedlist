package linkedList;

import main.Main;

public class SinglyLinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;
    }
    public SinglyLinkedList() {
        head = null;
        length = 0;
    }

    private Node head;
    private int length;

    public void addLast(T data) {
        Node node = new Node<>();
        node.data = data;
        node.next = null;

        if (head != null) {
            Node temp = head;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }

        else {
            head = node;
        }

        length++;

        Main.showProgress(toString());
    }

    public void addFirst(T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next =  head;
        head = node;

        length++;

        Main.showProgress(toString());
    }

    public void addAt(int index, T data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index != 0) {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;

            length++;
            Main.showProgress(toString());
        }
        else {
            addFirst(data);
        }
    }

    public void removeFirst() {
        head = head.next;

        length--;

        Main.showProgress(toString());
    }

    public void removeAt(int index) {
        if (index == length - 1) {
            removeLast();
        }
        else if (index == 0 && length > 0) {
            removeFirst();
        }
        else {
            Node temp = head;
            Node nextTemp = null;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            nextTemp = temp.next;
            temp.next = nextTemp.next;

            length--;

            Main.showProgress(toString());
        }
    }

    public void removeLast() {
        Node node = new Node();
        Node temp = head;

        if (length != 1) {
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = node.next;
            length--;

            Main.showProgress(toString());
        }
        else {
            removeFirst();
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        String tempString = "[";
        Node temp = head;

        if (length != 0) {
            while (temp.next != null) {
                tempString += temp.data + ", ";
                temp = temp.next;
            }
            tempString += temp.data;

        }

        tempString += "]";

        return tempString;
    }
}