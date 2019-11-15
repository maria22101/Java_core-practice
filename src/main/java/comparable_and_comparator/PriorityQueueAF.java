package comparable_and_comparator;

import java.util.PriorityQueue;

public class PriorityQueueAF {

    public static void main(String[] args) {
        PriorityQueue<AbstractFigure> q = new PriorityQueue<>(new CompAbstractFigureBySide());
        q.add(new Hexagon(11));
        q.add(new Triangle(21));
        q.add(new Square(31));

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
