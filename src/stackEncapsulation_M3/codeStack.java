package stackEncapsulation_M3;

public class codeStack {

    // Private inner class to represent a node in the linked list
    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // the top of the stack
    private int size; // the size of the stack

    public codeStack() {
        this.top = null;
        this.size = 0;
    }

    // Returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return this.size == 0;
    }

    // Returns the size of the stack
    public int size() {
        return this.size;
    }

    // Pushes a new element onto the top of the stack
    public void push(Object element) {
        Node newNode = new Node(element);
        newNode.next = this.top;
        this.top = newNode;
        this.size++;
    }

    // Removes and returns the element at the top of the stack
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object result = this.top.data;
        this.top = this.top.next;
        this.size--;
        return result;
    }

    // Returns the element at the top of the stack without removing it
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.top.data;
    }

    // Clears the stack
    public void clear() {
        this.top = null;
        this.size = 0;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        codeStack stack = new codeStack();

        stack.push("Hello");
        stack.push("World");
        stack.push(42);

        System.out.println(stack.pop()); // prints 42
        System.out.println(stack.pop()); // prints "World"
        System.out.println(stack.peek()); // prints "Hello"

        stack.clear();
        System.out.println(stack.isEmpty()); // prints true
    }
}
