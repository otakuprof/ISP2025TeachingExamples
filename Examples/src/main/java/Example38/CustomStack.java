package Example38;

public interface CustomStack<T> {
    // T is type parameter

    void push(T t);

    T pop();

    int size();

    T peek();

    boolean isEmpty();

    // Adapted from "Introduction to Java Programming" by Y Daniel Liang
}

