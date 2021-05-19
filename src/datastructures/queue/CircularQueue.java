package datastructures.queue;

import java.util.Scanner;

public class CircularQueue {

    static int[] array = new int[10];
    static int front = -1;
    static int rear = -1;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select option");
            System.out.println("1. isEmpty? | isFull?");
            System.out.println("2. Enqueue at Rear");
            System.out.println("3. Dequeue at Front");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter element to insert");
                    enqueueAtFront(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Dequeue " + array[front++]);
                    break;
                case 3:
                    break;
                case 4:
                    printQueue();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void printQueue() {
    }

    private static void enqueueAtRear(int nextInt) {
    }

    private static void enqueueAtFront(int nextInt) {
    }
}
