package module2._10_DSA_danh_sach.exercise.e1;

import java.util.Arrays;

public class MyList<E> implements Cloneable {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int size;

    MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    MyList(int initCapacity) {
        elements = (E[]) new Object[initCapacity];
    }

    void add(int index, E element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        ensureCapacity();
        for (int i = size; i > index; i--) elements[i] = elements[i - 1];
        elements[index] = element;
        size++;
    }

    boolean add(E e) {
        add(size, e);
        return true;
    }

    E remove(int index) {
        E[] tmp = (E[]) new Object[size - 1];
        E res = elements[index];
        for (int i = 0, j = 0; i < size; i++) {
            if (i != index) tmp[j++] = elements[i];
        }
        elements = tmp;
        size--;
        return res;
    }

    int size() {
        return size;
    }

    E get(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        return elements[index];
    }

    boolean cointains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) return true;
        }
        return false;
    }

    int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) return i;
        }
        return -1;
    }

    void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void ensureCapacity() {
        if (size >= elements.length) elements = Arrays.copyOf(elements, elements.length * 3 / 2);
    }
}


