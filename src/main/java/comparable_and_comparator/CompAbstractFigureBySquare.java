package comparable_and_comparator;

import java.util.Comparator;

public class CompAbstractFigureBySquare implements Comparator<AbstractFigure> {
    @Override
    public int compare(AbstractFigure o1, AbstractFigure o2) {
        return o1.getSquare() - o2.getSquare();
    }
}
