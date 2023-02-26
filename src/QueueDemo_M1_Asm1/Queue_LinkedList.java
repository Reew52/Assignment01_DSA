package QueueDemo_M1_Asm1;

public class Queue_LinkedList {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Queue_LinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = front.value;
        front = front.next;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.value;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queue_LinkedList queue = new Queue_LinkedList();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());  // outputs 1
        System.out.println(queue.dequeue());  // outputs 2
        System.out.println(queue.peek());  // outputs 3
        System.out.println(queue.size());  // outputs 3
    }
}

