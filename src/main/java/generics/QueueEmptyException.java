package generics;

public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "Queue is empty";
    }
}
