package StackDemoLinkedList_P3_ASM1;

public class Stack {
    private Node top;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public Stack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.value;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());  // outputs 6
        System.out.println(stack.pop());  // outputs 5
        System.out.println(stack.peek());  // outputs 4
        System.out.println(stack.pop());  // outputs 4
        System.out.println(stack.pop());  // outputs 3
        System.out.println(stack.pop());  // outputs 2
        System.out.println(stack.pop());  // outputs 1
        System.out.println(stack.pop());  // stack is empty
    }
}
