package Queue;
public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    public Queue(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue element");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % arr.length;
        }
        arr[rear] = element;
        size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue element");
            return -1;
        }
        int element = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        size--;
        return element;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek element");
            return -1;
        }
        return arr[front];
    }
    public boolean isFull() {
        return size == arr.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue()); // Output: 10
        System.out.println(q.peek()); // Output: 20
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Output: Queue is full, cannot enqueue element
    }
}