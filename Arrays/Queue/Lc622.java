package Queue;

import java.util.*;

public class Lc622 {

    private int[] queue;
     int front;
     int rear;
     int size;
     int k;

    public Lc622(int k) {

        queue = new int[k];

        front = 0;
        rear = 0;
        size = 0;

        this.k = k;
    }

    public boolean enQueue(int value) {

        if (isFull()) {
            return false;
        }

        queue[rear] = value;

        rear = (rear + 1) % k;

        size++;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % k;

        size--;

        return true;
    }

    public int Front() {

        if (isEmpty()) {
            return -1;
        }

        return queue[front];
    }

    public int Rear() {

        if (isEmpty()) {
            return -1;
        }

        return queue[(rear - 1 + k) % k];
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == k;
    }

    public static void main(String[] args) {

        Lc622 circularQueue = new Lc622(3);

        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);

        System.out.println(circularQueue.isFull()); // true

        System.out.println(circularQueue.Rear()); // 3

        circularQueue.deQueue();

        System.out.println(circularQueue.Front()); // 2
    }
}