package main;

import linkedList.CircularLinkedList;
import linkedList.DoublyLinkedList;
import linkedList.SinglyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final Scanner inputReader = new Scanner(System.in);

    public static void start() {
        int choice;
        do {
            choice = getUserIntInput(
                    "--------------------------------" +
                            "\nWelcome to my list of LinkedList" +
                            "\n--------------------------------" +
                            "\n1.) Singly LinkedList" +
                            "\n2.) Doubly LinkedList" +
                            "\n3.) Circular LinkedList" +
                            "\n4.) Exit" +
                            "\n--------------------------------" +
                            "\nUser Input: ");

            theChosenOne(choice);

        } while (choice != 4);

        out.println("\n--------------" +
                "\nGroup # # # #" +
                "\n-------------- " +
                "\nBibay Jonathan" +
                "\nMarc Capinpin" +
                "\nArvin Chu" +
                "\nZalven Dayao" +
                "\n--------------" +
                "\n\nThank you for using our program, make sure to come back.");
    }

    private static void theChosenOne(int choice) {
        switch(choice) {
            case 1:
                SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();

                singlyLinkedList = singlyLinkedListMenu(singlyLinkedList);
                break;
            case 2:
                DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

                doublyLinkedList = doublyLinkedListMenu(doublyLinkedList);
                break;
            case 3:
                CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();

                circularLinkedList = circularLinkedListMenu(circularLinkedList);
                break;
            case 4:
                break;
            default:
                out.println("\n---------------------" +
                        "\nInput is not a choice" +
                        "\n---------------------");
                break;
        }
    }

    private static CircularLinkedList circularLinkedListMenu (CircularLinkedList list) {
        int choice;
        do {
            choice = getUserIntInput("\n---------------------" +
                    "\nDoubly LinkedList" +
                    "\n---------------------" +
                    "\n1.) Insert at the end" +
                    "\n2.) Delete at the end" +
                    "\n3.) Show list" +
                    "\n4.) Exit" +
                    "\n---------------------" +
                    "\nUser Input: ");

            int data;
            switch (choice) {
                case 1:
                    data = getUserIntInput("Input the data: ");

                    list.addLast(data);
                    break;
                case 2:
                    list.deleteLast();
                    break;
                case 3:
                    showProgress(list.toString());
                    break;
                case 4:
                    break;
                default:
                    out.println("\n---------------------" +
                            "\nInput is not a choice" +
                            "\n---------------------");
                    break;
            }
        } while (choice != 4);

        return list;
    }

    private static DoublyLinkedList doublyLinkedListMenu(DoublyLinkedList list) {
        int choice;
        do {
            choice = getUserIntInput("\n----------------------------------------" +
                    "\nDoubly LinkedList" +
                    "\n----------------------------------------" +
                    "\n1.) Insert at the beginning" +
                    "\n2.) Insert at the any specified position" +
                    "\n3.) Insert at the end" +
                    "\n4.) Delete at the beginning" +
                    "\n5.) Delete at the any specified position" +
                    "\n6.) Delete at the end" +
                    "\n7.) Show list" +
                    "\n8.) Exit" +
                    "\n----------------------------------------" +
                    "\nUser Input: ");

            int data;
            int index;
            switch (choice) {
                case 1:
                    data = getUserIntInput("Input the data: ");

                    list.addFirst(data);
                    break;
                case 2:
                    index = getProperIndex(list.size());

                    data = getUserIntInput("Input the data: ");

                    list.addAt(index, data);
                    break;
                case 3:
                    data = getUserIntInput("Input the data: ");

                    list.addLast(data);
                    break;
                case 4:
                    try {
                        list.removeFirst();
                    }

                    catch (NullPointerException e) {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 5:
                    index = getProperIndex(list.size());

                    if (!list.isEmpty() && index == 0) {
                        list.removeAt(index);
                    }
                    else {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 6:
                    try {
                        list.removeLast();
                    }

                    catch (NullPointerException e) {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 7:
                    showProgress(list.toString());
                    break;
                case 8:
                    break;
                default:
                    out.println("\n---------------------" +
                            "\nInput is not a choice" +
                            "\n---------------------");
                    break;
            }
        } while (choice != 8);

        return list;
    }

    private static SinglyLinkedList singlyLinkedListMenu(SinglyLinkedList list) {
        int choice;
        do {
            choice = getUserIntInput("\n----------------------------------------" +
                    "\nSingly LinkedList" +
                    "\n----------------------------------------" +
                    "\n1.) Insert at the beginning" +
                    "\n2.) Insert at the any specified position" +
                    "\n3.) Insert at the end" +
                    "\n4.) Delete at the beginning" +
                    "\n5.) Delete at the any specified position" +
                    "\n6.) Delete at the end" +
                    "\n7.) Show list" +
                    "\n8.) Exit" +
                    "\n----------------------------------------" +
                    "\nUser Input: ");

            int data;
            int index;
            switch (choice) {
                case 1:
                    data = getUserIntInput("Input the data: ");

                    list.addFirst(data);
                    break;
                case 2:
                    index = getProperIndex(list.size());

                    data = getUserIntInput("Input the data: ");

                    list.addAt(index, data);
                    break;
                case 3:
                    data = getUserIntInput("Input the data: ");

                    list.addLast(data);
                    break;
                case 4:
                    try {
                        list.removeFirst();
                    }
                    catch (NullPointerException e) {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 5:
                    index = getProperIndex(list.size());

                    if (!list.isEmpty() && index == 0) {
                        list.removeAt(index);
                    }
                    else {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 6:
                    try {
                        list.removeLast();
                    }

                    catch (NullPointerException e) {
                        out.println("\n----------------------------------------" +
                                "\nERROR ERROR LINKEDLIST EMPTY ERROR ERROR" +
                                "\n----------------------------------------");
                    }
                    break;
                case 7:
                    showProgress(list.toString());
                    break;
                case 8:
                    break;
                default:
                    out.println("\n---------------------" +
                            "\nInput is not a choice" +
                            "\n---------------------");
                    break;
            }
        } while (choice != 8);

        return list;
    }

    private static int getProperIndex(int size) {
        int index;

        do {
            index = getUserIntInput("Input the index: ");

            if (index < 0 || index > size) {
                out.println("---------------------------------------------------" +
                        "\nIndex must be greater than 0 and less than the size" +
                        "\nCurrent size: " + size +
                        "\n---------------------------------------------------");
            }
        } while (index < 0 || index > size);

        return index;
    }

    private static int getUserIntInput(String whatToGet) {
        int value;

        do {
            out.print(whatToGet);
            try {
                value = inputReader.nextInt();
                break;
            }

            catch (InputMismatchException e) {
                out.println("\n----------------------" +
                        "\nInput must be a number" +
                        "\n----------------------\n");
                inputReader.next();
            }

        } while (true);

        return value;
    }

    public static void showProgress(String toString) {
        out.println();
        for (int i = 0; i < toString.length(); i++) {
            out.print("-");
        }
        System.out.println("\n" + toString);

        for (int i = 0; i < toString.length(); i++) {
            out.print("-");
        }

        out.println("");
    }
}
