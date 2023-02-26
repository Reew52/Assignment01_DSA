package StackDemoArray_P3_ASM1;
public class Stack {
    private int[] arr;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);  // stack is full

        System.out.println(stack.pop());  // outputs 5
        System.out.println(stack.pop());  // outputs 4
        System.out.println(stack.peek());  // outputs 3
        System.out.println(stack.pop());  // outputs 3
        System.out.println(stack.pop());  // outputs 2
        System.out.println(stack.pop());  // outputs 1
        System.out.println(stack.pop());  // stack is empty
    }
}
