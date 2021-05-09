package datastructures.queue;

import java.util.Scanner;

public class DoubleEndedQueue {
    static int front = -1;
    static int rear = -1;
    static int[] array = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select option");
            System.out.println("1. Enqueue at Front");
            System.out.println("2. Enqueue at Rear");
            System.out.println("3. Dequeue at Front");
            System.out.println("4. Dequeue at Rear");
            System.out.println("5. Print elements");
            System.out.println("6. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter element to insert");
                    enqueueAtFront(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter element to insert");
                    enqueueAtRear(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Dequeue at front" + array[front++]);
                    break;
                case 4:
                    System.out.println("Dequeue at front" + array[rear--]);
                    break;
                case 5:
                    printQueue();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void enqueueAtRear(int inp) {
        if (isEmpty()) {
            array[front++] = inp;
            rear++;
        } else {
            if(rear < array.length) {
                array[rear++] = inp;
            }
        }

    }
    private static boolean isEmpty() {
        if(front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    private static void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.println(array[i]);
        }
    }

    private static void enqueueAtFront(int inp) {
        if (isEmpty()) {
            array[front++] = inp;
            rear++;
        }
        if (front < rear) {
            array[front++] = inp;
        }
    }

}
