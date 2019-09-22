package collections.queue;

public class QueueChartsFixed implements QueueCharsBasic {
    private char[] q;
    private int putIndex, getIndex;

    public QueueChartsFixed(int size){
        q = new char[size + 1];
        putIndex = getIndex = 0;
    }

    @Override
    public void put(char ch) {
        if (putIndex == q.length - 1){
            System.out.println("Queue is full.");
            return;
        }
        q[putIndex++] = ch;
    }

    @Override
    public char get() {
        if (getIndex == putIndex){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getIndex++];
    }
}
