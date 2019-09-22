package collections.queue;

public class QueueCharsCircular implements QueueCharsBasic {
    private char[] q;
    private int putIndex, getIndex;

    public QueueCharsCircular(int size){
        q = new char[size + 1];
        putIndex = getIndex = 0;
    }

    @Override
    public void put(char ch) {
        //Queue is full when putIndex is behind by one vs getIndex or when putIndex is at the end of the q array and getIndex - at beginning
        if (putIndex + 1 == getIndex || (putIndex == q.length - 1 && getIndex == 0)){
            System.out.println("Queue is full.");
            return;
        }
        if (putIndex == q.length){
            putIndex = 0;
        }
        q[putIndex++] = ch;
    }

    @Override
    public char get() {
        if (getIndex == putIndex){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        if (getIndex == q.length){
            getIndex = 0;
        }
        return q[getIndex++];
    }
}
