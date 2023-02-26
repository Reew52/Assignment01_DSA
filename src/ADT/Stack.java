package ADT;

public class Stack<T> {
    private int top;
    private int capacity;
    private T[] data;

    @SuppressWarnings("unchecked")
    public Stack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Initial capacity must be at least 1");
        }
        capacity = initialCapacity;
        data = (T[]) new Object[capacity];
        top = -1;
    }

    public Stack() {
        this(10);
    }

    public void push(T element) {
        if (isFull()) {
            reallocate();
        }
        top++;
        data[top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T element = data[top];
        top--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        T[] newData = (T[]) new Object[capacity * 2];
        System.arraycopy(data, 0, newData, 0, capacity);
        data = newData;
        capacity *= 2;
    }
}
