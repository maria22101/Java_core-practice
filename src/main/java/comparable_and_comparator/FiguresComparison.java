package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FiguresComparison {

    public static void main(String[] args) {

        Square square = new Square(10);
        Triangle triangle = new Triangle(40);
        Hexagon hexagon = new Hexagon(10);

        //involving Comparable with overridden compareTo():
        ArrayList<AbstractFigure> abstractFigures1 = new ArrayList<>();
        abstractFigures1.add(square);
        abstractFigures1.add(triangle);
        abstractFigures1.add(hexagon);
        System.out.println("Abstract figures list before sorting: " + abstractFigures1);

        Collections.sort(abstractFigures1);
        System.out.println("Abstract figures list after sorting (Comparable involved): " + abstractFigures1);
        System.out.println();

        //involving Comparator with overridden compare():
        ArrayList<AbstractFigure> abstractFigures2 = new ArrayList<>();
        abstractFigures2.add(square);
        abstractFigures2.add(triangle);
        abstractFigures2.add(hexagon);
        System.out.println("Abstract figures list before sorting: " + abstractFigures2);

        abstractFigures2.sort(new CompAbstractFigureBySide());
        System.out.println("Abstract figures list after sorting (by side Comparator involved): " + abstractFigures2);

        abstractFigures2.sort(new CompAbstractFigureBySquare());
        System.out.println("Abstract figures list after sorting (by square Comparator involved): " + abstractFigures2);

        abstractFigures2.sort((o1, o2) -> o2.getSquare() - o1.getSquare());
        System.out.println("Abstract figures list after sorting (by square descending Comparator involved): " + abstractFigures2);
        System.out.println();
    }
}
