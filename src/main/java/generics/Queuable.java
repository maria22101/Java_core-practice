package generics;

public interface Queuable<T> {
    void put(T elem) throws QueueFullException;
    T get() throws QueueEmptyException;
}
