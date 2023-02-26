package Stack;
public class Stack {
    private int top;
    private int[] arr;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.top = -1;
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    // Method to add an element to the top of the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = element;
        }
    }

    // Method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popped = arr[top];
            top--;
            return popped;
        }
    }

    // Method to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method to launch the program
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
