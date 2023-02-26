package ADT;
import java.util.ArrayList;

public class ListADT<T> {
    private T[] data;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ListADT(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Initial capacity must be at least 1");
        }
        data = (T[]) new Object[initialCapacity];
        size = 0;
        capacity = initialCapacity;
    }

    public ListADT() {
        this(10);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean add(T element) {
        if (isFull()) {
            reallocate();
        }
        data[size] = element;
        size++;
        return true;
    }

    public boolean insert(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (isFull()) {
            reallocate();
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
        return true;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public T removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T element = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return element;
    }

    public boolean replace(T oldElement, T newElement) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(oldElement)) {
                data[i] = newElement;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        capacity *= 2;
        T[] newData = (T[]) new Object[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}
