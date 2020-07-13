package com.company.book;

public class ArrayQueue {

    private final int[] array;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {
        this.array = new int[capacity];
    }

    public static void main(String[] args) throws Exception {
        ArrayQueue arrayQueue = new ArrayQueue(6);
        arrayQueue.enQueue(3);
        arrayQueue.enQueue(5);
        arrayQueue.enQueue(6);
        arrayQueue.enQueue(8);
        arrayQueue.enQueue(1);
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.enQueue(2);
        arrayQueue.enQueue(4);
        arrayQueue.enQueue(9);
        arrayQueue.enQueue(9);
        arrayQueue.outPut();
    }

    /**
     * 入队
     *
     * @param element
     * @throws Exception
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    public int deQueue() throws Exception {
        if (rear == front) {
            throw new Exception("队列已空！");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    public void outPut() {
        System.out.println("front " + front);
        System.out.println("rear " + rear);
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }
    }
}
