package QueueDemo_M1_Asm1;

public class Queue_Array {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public Queue_Array(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear++;
        arr[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = arr[front];
        front++;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public boolean isFull() {
        return (rear == capacity - 1);
    }

    public boolean isEmpty() {
        return (front > rear);
    }

    public static void main(String[] args) {
        Queue_Array queue = new Queue_Array(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // queue is full

        System.out.println(queue.dequeue());  // outputs 1
        System.out.println(queue.dequeue());  // outputs 2
        System.out.println(queue.peek());  // outputs 3
        System.out.println(queue.dequeue());  // outputs 3
        System.out.println(queue.dequeue());  // outputs 4
        System.out.println(queue.dequeue());  // outputs 5
        System.out.println(queue.dequeue());  // queue is empty
    }
}
