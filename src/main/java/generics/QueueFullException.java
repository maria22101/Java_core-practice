package generics;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Queue is full: maximum size " + size + " achieved";
    }
}
