package Queue;

public class CodeQueueLinkedList {
    private Node front;
    private Node rear;
    private int size;
    private int capacity;
    
    private class Node {
        private String code;
        private Node next;
        
        public Node(String code) {
            this.code = code;
            next = null;
        }
    }
    
    public CodeQueueLinkedList(int capacity) {
        this.capacity = capacity;
        front = null;
        rear = null;
        size = 0;
    }
    
    public void enqueue(String code) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        Node newNode = new Node(code);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }
    
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        String code = front.code;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return code;
    }
    
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.code;
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
        CodeQueueLinkedList queue = new CodeQueueLinkedList(5);
        queue.enqueue("CODE1");
        queue.enqueue("CODE2");
        queue.enqueue("CODE3");
        System.out.println(queue.dequeue()); // CODE1
        System.out.println(queue.peek()); // CODE2
        System.out.println(queue.getSize()); // 2
        System.out.println(queue.getCapacity()); // 5
    }
}
