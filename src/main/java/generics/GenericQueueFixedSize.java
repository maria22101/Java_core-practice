package generics;

public class GenericQueueFixedSize<T> implements Queuable<T> {
    private T[] q;
    private int putIndex, getIndex;

    public GenericQueueFixedSize(T[] q) {
        this.q = q;
        putIndex = getIndex = 0;
    }

    @Override
    public void put(T elem) throws QueueFullException {
        if (putIndex == q.length - 1) {
            throw new QueueFullException(q.length - 1);
        }
        q[putIndex++] = elem;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getIndex == putIndex) {
            throw new QueueEmptyException();
        }
        return q[getIndex++];
    }
}
