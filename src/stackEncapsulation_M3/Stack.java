package stackEncapsulation_M3;

public class Stack {
    private int[] data;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.data = new int[capacity];
    }

    public void push(int item) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        top++;
        data[top] = item;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }
        int item = data[top];
        top--;
        return item;
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity - 1);
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop()); // prints 3
        System.out.println(s.pop()); // prints 2
        System.out.println(s.peek()); // prints 1
        
    }
}
