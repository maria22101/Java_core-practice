package interfaces;

import interfaces.calculator.*;

import java.util.ArrayList;

public class MainCalc {
    public static void main(String[] args) {
        ArrayList<Operation> opp = new ArrayList<>();
        opp.add(new Add(0, 1));
        opp.add(new Substract(4, 2));
        opp.add(new Multiply(1, 3));
        opp.add(new Divide(20, 5));
        opp.add(new AddWithHundred(3, 3));

        opp.forEach(el -> System.out.print(el.operation() + "; "));
    }
}
