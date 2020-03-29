//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import static java.lang.System.out;
//
//class EntryPoint {
//    public static void main(String... args) {
//        Main.start();
//    }
//}
//
//class Main {
//    private static final Scanner inputReader = new Scanner(System.in);
//
//    public static void start() {
//        int choice;
//        do {
//            choice = getUserIntInput(
//                    "--------------------------------" +
//                            "\nWelcome to my list of LinkedList" +
//                            "\n--------------------------------" +
//                            "\n1.) Singly LinkedList" +
//                            "\n2.) Doubly LinkedList" +
//                            "\n3.) Circular LinkedList" +
//                            "\n4.) Exit" +
//                            "\n--------------------------------" +
//                            "\nUser Input: ");
//
//            theChosenOne(choice);
//
//        } while (choice != 4);
//
//        out.println("\n--------------" +
//                "\nGroup # # # #" +
//                "\n-------------- " +
//                "\nBibay Jonathan" +
//                "\nMarc Capinpin" +
//                "\nArvin Chu" +
//                "\nZalven Dayao" +
//                "\n--------------" +
//                "\n\nThank you for using our program, make sure to come back.");
//    }
//
//    private static void theChosenOne(int choice) {
//        switch(choice) {
//            case 1:
//                SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
//
//                singlyLinkedList = singlyLinkedListMenu(singlyLinkedList);
//                break;
//            case 2:
//                DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
//
//                doublyLinkedList = doublyLinkedListMenu(doublyLinkedList);
//                break;
//            case 3:
//                CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
//
//                circularLinkedList = circularLinkedListMenu(circularLinkedList);
//                break;
//            case 4:
//                break;
//            default:
//                out.println("\n---------------------" +
//                        "\nInput is not a choice" +
//                        "\n---------------------");
//                break;
//        }
//    }
//
//    private static CircularLinkedList circularLinkedListMenu (CircularLinkedList list) {
//        int choice;
//        do {
//            choice = getUserIntInput("\n---------------------" +
//                    "\nDoubly LinkedList" +
//                    "\n---------------------" +
//                    "\n1.) Insert at the end" +
//                    "\n2.) Delete at the end" +
//                    "\n3.) Show list" +
//                    "\n4.) Exit" +
//                    "\n---------------------" +
//                    "\nUser Input: ");
//
//            int data;
//            switch (choice) {
//                case 1:
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addLast(data);
//                    break;
//                case 2:
//                    list.deleteLast();
//                    break;
//                case 3:
//                    showProgress(list.toString());
//                    break;
//                case 4:
//                    break;
//                default:
//                    out.println("\n---------------------" +
//                            "\nInput is not a choice" +
//                            "\n---------------------");
//                    break;
//            }
//        } while (choice != 4);
//
//        return list;
//    }
//
//    private static DoublyLinkedList doublyLinkedListMenu(DoublyLinkedList list) {
//        int choice;
//        do {
//            choice = getUserIntInput("\n----------------------------------------" +
//                    "\nDoubly LinkedList" +
//                    "\n----------------------------------------" +
//                    "\n1.) Insert at the beginning" +
//                    "\n2.) Insert at the any specified position" +
//                    "\n3.) Insert at the end" +
//                    "\n4.) Delete at the beginning" +
//                    "\n5.) Delete at the any specified position" +
//                    "\n6.) Delete at the end" +
//                    "\n7.) Show list" +
//                    "\n8.) Exit" +
//                    "\n----------------------------------------" +
//                    "\nUser Input: ");
//
//            int data;
//            int index;
//            switch (choice) {
//                case 1:
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addFirst(data);
//                    break;
//                case 2:
//                    index = getProperIndex(list.size());
//
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addAt(index, data);
//                    break;
//                case 3:
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addLast(data);
//                    break;
//                case 4:
//                    try {
//                        list.removeFirst();
//                    }
//
//                    catch (NullPointerException e) {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 5:
//                    index = getProperIndex(list.size());
//
//                    if (!list.isEmpty() && index == 0) {
//                        list.removeAt(index);
//                    }
//                    else {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 6:
//                    try {
//                        list.removeLast();
//                    }
//
//                    catch (NullPointerException e) {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 7:
//                    showProgress(list.toString());
//                    break;
//                case 8:
//                    break;
//                default:
//                    out.println("\n---------------------" +
//                            "\nInput is not a choice" +
//                            "\n---------------------");
//                    break;
//            }
//        } while (choice != 8);
//
//        return list;
//    }
//
//    private static SinglyLinkedList singlyLinkedListMenu(SinglyLinkedList list) {
//        int choice;
//        do {
//            choice = getUserIntInput("\n----------------------------------------" +
//                    "\nSingly LinkedList" +
//                    "\n----------------------------------------" +
//                    "\n1.) Insert at the beginning" +
//                    "\n2.) Insert at the any specified position" +
//                    "\n3.) Insert at the end" +
//                    "\n4.) Delete at the beginning" +
//                    "\n5.) Delete at the any specified position" +
//                    "\n6.) Delete at the end" +
//                    "\n7.) Show list" +
//                    "\n8.) Exit" +
//                    "\n----------------------------------------" +
//                    "\nUser Input: ");
//
//            int data;
//            int index;
//            switch (choice) {
//                case 1:
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addFirst(data);
//                    break;
//                case 2:
//                    index = getProperIndex(list.size());
//
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addAt(index, data);
//                    break;
//                case 3:
//                    data = getUserIntInput("Input the data: ");
//
//                    list.addLast(data);
//                    break;
//                case 4:
//                    try {
//                        list.removeFirst();
//                    }
//                    catch (NullPointerException e) {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 5:
//                    index = getProperIndex(list.size());
//
//                    if (!list.isEmpty() && index == 0) {
//                        list.removeAt(index);
//                    }
//                    else {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 6:
//                    try {
//                        list.removeLast();
//                    }
//
//                    catch (NullPointerException e) {
//                        out.println("\n----------------------------------------" +
//                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
//                                "\n----------------------------------------");
//                    }
//                    break;
//                case 7:
//                    showProgress(list.toString());
//                    break;
//                case 8:
//                    break;
//                default:
//                    out.println("\n---------------------" +
//                            "\nInput is not a choice" +
//                            "\n---------------------");
//                    break;
//            }
//        } while (choice != 8);
//
//        return list;
//    }
//
//    private static int getProperIndex(int size) {
//        int index;
//
//        do {
//            index = getUserIntInput("Input the index: ");
//
//            if (index < 0 || index > size) {
//                out.println("---------------------------------------------------" +
//                        "\nIndex must be greater than 0 and less than the size" +
//                        "\nCurrent size: " + size +
//                        "\n---------------------------------------------------");
//            }
//        } while (index < 0 || index > size);
//
//        return index;
//    }
//
//    private static int getUserIntInput(String whatToGet) {
//        int value;
//
//        do {
//            out.print(whatToGet);
//            try {
//                value = inputReader.nextInt();
//                break;
//            }
//
//            catch (InputMismatchException e) {
//                out.println("\n----------------------" +
//                        "\nInput must be a number" +
//                        "\n----------------------\n");
//                inputReader.next();
//            }
//
//        } while (true);
//
//        return value;
//    }
//
//    public static void showProgress(String toString) {
//        out.println();
//        for (int i = 0; i < toString.length(); i++) {
//            out.print("-");
//        }
//        System.out.println("\n" + toString);
//
//        for (int i = 0; i < toString.length(); i++) {
//            out.print("-");
//        }
//
//        out.println("");
//    }
//}
//
//class SinglyLinkedList<T> {
//    private class Node<T> {
//        T data;
//        Node<T> next;
//    }
//    public SinglyLinkedList() {
//        head = null;
//        length = 0;
//    }
//
//    private Node head;
//    private int length;
//
//    public void addLast(T data) {
//        Node node = new Node<>();
//        node.data = data;
//        node.next = null;
//
//        if (head != null) {
//            Node temp = head;
//
//            while(temp.next != null) {
//                temp = temp.next;
//            }
//
//            temp.next = node;
//        }
//
//        else {
//            head = node;
//        }
//
//        length++;
//
//        Main.showProgress(toString());
//    }
//
//    public void addFirst(T data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//        node.next =  head;
//        head = node;
//
//        length++;
//
//        Main.showProgress(toString());
//    }
//
//    public void addAt(int index, T data) {
//        Node node = new Node();
//        node.data = data;
//        node.next = null;
//
//        if (index != 0) {
//            Node n = head;
//
//            for (int i = 0; i < index - 1; i++) {
//                n = n.next;
//            }
//
//            node.next = n.next;
//            n.next = node;
//
//            length++;
//            Main.showProgress(toString());
//        }
//        else {
//            addFirst(data);
//        }
//    }
//
//    public void removeFirst() {
//        head = head.next;
//
//        length--;
//
//        Main.showProgress(toString());
//    }
//
//    public void removeAt(int index) {
//        if (index == length - 1) {
//            removeLast();
//        }
//        else if (index == 0 && length > 0) {
//            removeFirst();
//        }
//        else {
//            Node temp = head;
//            Node nextTemp = null;
//
//            for (int i = 0; i < index - 1; i++) {
//                temp = temp.next;
//            }
//
//            nextTemp = temp.next;
//            temp.next = nextTemp.next;
//
//            length--;
//
//            Main.showProgress(toString());
//        }
//    }
//
//    public void removeLast() {
//        Node node = new Node();
//        Node temp = head;
//
//        if (length != 1) {
//            while (temp.next.next != null) {
//                temp = temp.next;
//            }
//
//            temp.next = node.next;
//            length--;
//
//            Main.showProgress(toString());
//        }
//        else {
//            removeFirst();
//        }
//    }
//
//    public int size() {
//        return length;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//    public String toString() {
//        String tempString = "[";
//        Node temp = head;
//
//        if (length != 0) {
//            while (temp.next != null) {
//                tempString += temp.data + ", ";
//                temp = temp.next;
//            }
//            tempString += temp.data;
//
//        }
//
//        tempString += "]";
//
//        return tempString;
//    }
//}
//
//class DoublyLinkedList<T> {
//    private class Node<T> {
//        T data;
//        Node next;
//        Node previous;
//    }
//
//    public DoublyLinkedList() {
//        this.head = null;
//        this.tail = null;
//        this.length = 0;
//    }
//
//    private Node head;
//    private Node tail;
//    private int length;
//
//    public void addFirst(T data) {
//        Node node = new Node();
//        node.data = data;
//
//        if (isEmpty()) {
//            tail = node;
//        }
//
//        else {
//            head.previous = node;
//        }
//
//        node.next = head;
//        head = node;
//        length++;
//
//        Main.showProgress(toString());
//    }
//
//    public void addAt(int index, T data) {
//        Node node = new Node();
//        node.data = data;
//
//        if (index == 0) {
//            addFirst(data);
//        }
//
//        else if (index == length - 1) {
//            addLast(data);
//        }
//
//        else {
//            Node temp = head;
//            for (int i = 0; i < index; i++) {
//                temp = temp.next;
//            }
//
//            temp.previous.next = node;
//            node.next = temp;
//
//            length++;
//
//            Main.showProgress(toString());
//        }
//    }
//
//    public void addLast(T data) {
//        Node node = new Node();
//        node.data = data;
//
//        if (isEmpty()) {
//            head = node;
//        }
//
//        else {
//            tail.next = node;
//        }
//
//        node.previous = tail;
//        tail = node;
//
//        length++;
//
//        Main.showProgress(toString());
//    }
//
//    public void removeFirst() {
//        head = head.next;
//        length--;
//
//        System.out.println(toString());
//    }
//
//    public void removeAt(int index) {
//        if (index == 0) {
//            removeFirst();
//        }
//        else if (index == length - 1) {
//            removeLast();
//        }
//        else {
//            Node temp = head;
//
//            for (int i = 0; i < index - 1; i++) {
//                temp = temp.next;
//            }
//
//            temp.next = temp.next.next;
//            temp.next.previous = temp;
//
//            length--;
//            Main.showProgress(toString());
//        }
//    }
//
//    public void removeLast() {
//        if (length != 1) {
//            tail = tail.previous;
//            tail.next = null;
//
//            length--;
//            Main.showProgress(toString());
//        }
//
//        else {
//            removeFirst();
//        }
//    }
//
//    public String toString() {
//        String tempString = "[";
//        Node temp = head;
//
//        if (!isEmpty()) {
//            while (temp.next != null) {
//                tempString += temp.data + ", ";
//                temp = temp.next;
//            }
//            tempString += temp.data + "]";
//        }
//
//        return tempString;
//    }
//
//    public int size() {
//        return length;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//}
//
//class CircularLinkedList<T> {
//    private class Node<T> {
//        T data;
//        Node<T> next;
//    }
//
//    public CircularLinkedList() {
//        this.head = null;
//        this.tail = null;
//        this.length = 0;
//    }
//
//    private Node head;
//    private Node tail;
//    private int length;
//
//    public void addLast(T data) {
//        Node node = new Node();
//        node.data = data;
//
//        if (isEmpty()) {
//            head = node;
//            tail = node;
//            node.next = head;
//        }
//
//        else {
//            tail.next = node;
//            tail = node;
//            tail.next = head;
//        }
//
//        length++;
//
//        Main.showProgress(toString());
//    }
//
//    public void deleteLast() {
//        if (length == 1) {
//            head = null;
//            tail = null;
//        }
//
//        else {
//            Node temp = head;
//
//            while (temp.next != tail) {
//                temp = temp.next;
//            }
//
//            tail = temp;
//            tail.next = head;
//        }
//
//        length--;
//
//        Main.showProgress(toString());
//    }
//
//    public String toString() {
//        Node temp = head;
//        String tempString = "[";
//
//        if (!isEmpty()) {
//            while (temp != tail) {
//                tempString += temp.data + ", ";
//                temp = temp.next;
//            }
//            tempString += temp.data;
//        }
//
//        tempString += "]";
//
//        return tempString;
//    }
//
//    public int size() {
//        return length;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//}