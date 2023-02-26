package ADT;

public class Queue {
    private int[] queueArray;
    private int front, rear, maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        } else {
            rear++;
            queueArray[rear] = item;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            int dequeuedItem = queueArray[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
            return dequeuedItem;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return queueArray[front];
        }
    }

    public int size() {
        return rear - front + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == maxSize;
    }
}


