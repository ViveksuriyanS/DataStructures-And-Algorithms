package datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueues {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    static int topIndex = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operation");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Is Stack Empty?");
            System.out.println("4. exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter element to be pushed");
                    push(scanner.nextInt());
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    isEmptyStack();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }

    }

    private static void isEmptyStack() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            System.out.println("Stack is not empty..");
        }
    }

    private static void pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        System.out.println(q1.remove());
        q1.addAll(q2);
        q2.clear();
    }

    private static void push(int inp) {
        q1.add(inp);
        topIndex++;
    }

}
