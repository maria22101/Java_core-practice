package collections.queue;

public class QueueDemo {
    public static void main(String[] args) {
        QueueChartsFixed q1 = new QueueChartsFixed(12);
        QueueCharsCircular q2 = new QueueCharsCircular(6);
        QueueCharsDynamic q3 = new QueueCharsDynamic(3);

        QueueCharsBasic iQ;

        //Demonstrating a fixed queue
        iQ = q1;
        for (int i = 0; i < 12; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.print("Fixed queue content: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(iQ.get());
            ;
        }
        System.out.println();

        //Demonstrating a circular queue
        iQ = q2;
        for (int i = 0; i < 6; i++) { //filling in the circular queue
            iQ.put((char) ('A' + i));
        }
        System.out.print("Circular queue content_1: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();
        for (int j = 6; j < 12; j++) { //filling in the circular queue once more
            iQ.put((char) ('A' + j));
        }
        System.out.print("Circular queue content_2: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(iQ.get());
        }
        System.out.println();
        System.out.print("Circular queue content_3: ");
        for (int i = 0; i < 12 ; i++) { //filling in and consuming from the circular queue
            iQ.put((char) ('A' + i));
            System.out.print(iQ.get());
        }
        System.out.println();

        //Demonstrating a dynamic queue
        iQ = q3;
        for (int i = 0; i < 7; i++) {
            iQ.put((char) ('P' + i));
        }
        System.out.print("Dynamic queue content: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(iQ.get());
        }
    }
}
