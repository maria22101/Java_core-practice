package collections.queue;

public class QueueInArray { //a queue based upon an array - example made with chars & Alphabet
    char[] charQ;
    int putIndex;
    int getIndex;

    QueueInArray(int size) {
        charQ = new char[size + 1];
        putIndex = 0;
        getIndex = 0;
    }

    void put(char ch) {
        if (putIndex == charQ.length - 1) {
            System.out.println(" - the queue is full");
            return;
        }
        putIndex++;
        charQ[putIndex] = ch;
    }

    char get() {
        if (getIndex == putIndex) {
            System.out.println(" - the queue is empty");
            return (char) 0;
        }
        getIndex++;
        return charQ[getIndex];
    }

    public static void main(String[] args) {
        QueueInArray bigQueue = new QueueInArray(50);
        QueueInArray smallQueue = new QueueInArray(3);

        for (int i = 0; i < 26; i++) { // example with a sufficient size array
            bigQueue.put((char) ('A' + i));
        }
        System.out.print("Big queue contains: ");
        for (int i = 0; i < 26; i++) {
            char chr = bigQueue.get();
            System.out.print(chr);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) { // example with an insufficient size array
            System.out.println("Placing " + (char) ('Z' - i) + " in the small queue");
            smallQueue.put((char) ('Z' - i));
        }
        System.out.print("Small queue contains: ");
        for (int i = 0; i < 4; i++) {
            char chr = smallQueue.get();
            if (chr != 0) System.out.print(chr);
        }
    }
}
