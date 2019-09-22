package collections.queue;

public class QueueCharsDynamic implements QueueCharsBasic {
    private char[] q;
    private int putIndex, getIndex;

    public QueueCharsDynamic(int size){
        q = new char[size + 1];
        putIndex = getIndex = 0;
    }

    @Override
    public void put(char ch) {
        // We assume that we will not face situation adding elements to the full queue - we increase its length instead
        if (putIndex == q.length - 1){
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
}
