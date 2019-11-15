package comparable_and_comparator;

import java.util.Comparator;

public class CompAbstractFigureBySide implements Comparator<AbstractFigure> {
    @Override
    public int compare(AbstractFigure o1, AbstractFigure o2) {
        return o1.sides - o2.sides;
    }
}
