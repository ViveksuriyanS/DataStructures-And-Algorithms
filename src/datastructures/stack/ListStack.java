package datastructures.stack;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ListStack {
    static int max;
    static Node head;
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        max = sc.nextInt();

        while (true) {
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Is Full Stack");
            System.out.println("4. Is Empty Stack");
            System.out.println("5. Print Stack");
            System.out.println("6. Top Element in Stack");
            System.out.println("7. Search Element");
            System.out.println("8. Exit Stack");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter element to be inserted");
                    if (isFull()) {
                        System.out.println("Stack is full.. Cannot insert new value");
                    } else {
                        push(sc.nextInt());
                    }
                    break;
                case 2:
                    if (isEmpty()) {
                        System.out.println("Stack is already empty");
                    } else {
                        int popedElement = pop();
                        System.out.println("Element poped is " + popedElement);
                    }
                    break;
                case 3:
                    if (isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 4:
                    if(isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    printStack();
                    break;
                case 6:
                    if(isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println(head.getData() + " is the top element");
                    }
                    break;
                case 7:
                    System.out.println("Enter the number to search");
                    searchStack(sc.nextInt());
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void searchStack(int search) {
        Node tmp = head;
        boolean isFound = false;
        while(tmp != null) {
            if(tmp.getData() == search) {
                System.out.println(tmp.getData() + " Value found");
                isFound = true;
            }
            tmp = tmp.getNextNode();
        }
        if(!isFound) {
            System.out.println("Value not found");
        }
    }

    private static void printStack() {
        if(size == -1) {
            System.out.println("Stack is empty");
        }
        Node tmp = head;
        while(tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNextNode();
        }
    }

    private static int pop() {
        int popVal = head.getData();
        head = head.nextNode;

        return popVal;
    }

    private static boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    private static void push(int newVal) {
        Node tmp = head;
        Node newNode = new Node();
        newNode.setData(newVal);
        head = newNode;
        head.setNextNode(tmp);
        size++;
    }

    private static boolean isFull() {
        if (size > max) {
            return true;
        }
        return false;
    }

}

class Node {
    int data;
    Node nextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}