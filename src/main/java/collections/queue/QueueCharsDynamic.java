package collections.queue;

public class QueueCharsDynamic implements QueueCharsBasic {
    private char[] q;
    private int putIndex, getIndex;

    public QueueCharsDynamic(int size) {
        q = new char[size + 1];
        putIndex = getIndex = 0;
    }

    public static void copyFromQueue(QueueCharsBasic destination, QueueCharsBasic origin) {
        if (origin.getSize() != destination.getSize()) {
            System.out.println("Destination size is incompatible. Please, adjust the Destination queue size to the Origin's");
        } else {
            int size = origin.getSize();
            for (int i = 0; i < size; i++) {
                destination.put(origin.get());
            }
        }
    }

    @Override
    public void put(char ch) {
        // We assume that we will not face situation adding elements to the full queue - we increase its length instead
        if (putIndex == q.length - 1) {
            char[] new_queue = new char[q.length * 2];
            for (int i = 0; i < q.length; i++) {
                new_queue[i] = q[i];
            }
            q = new_queue;
        }
        q[putIndex++] = ch;
    }

    @Override
    public char get() {
        if (getIndex == putIndex) {
            System.out.println("Queue is empty.");
            return (char) 0;
        }
        return q[getIndex++];
    }

    @Override
    public int getSize() {
        return q.length - 1;
    }
}
