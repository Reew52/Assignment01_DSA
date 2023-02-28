package Queue;

public class CodeQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public CodeQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(String code) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = code;
        size++;
    }
    
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String code = queue[front];
        front = (front + 1) % capacity;
        size--;
        return code;
    }
    
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public static void main(String[] args) {
        CodeQueue queue = new CodeQueue(5);
        queue.enqueue("CODE1");
        queue.enqueue("CODE2");
        queue.enqueue("CODE3");
        System.out.println(queue.dequeue()); // CODE1
        System.out.println(queue.peek()); // CODE2
        System.out.println(queue.getSize()); // 2
        System.out.println(queue.getCapacity()); // 5
    }
}
