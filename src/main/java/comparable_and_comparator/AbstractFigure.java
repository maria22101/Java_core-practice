package comparable_and_comparator;

public abstract class AbstractFigure implements Comparable<AbstractFigure>{
    int sides;

    public AbstractFigure(int sides) {
        this.sides = sides;
    }

    public abstract int getSquare();

//    @Override
    public int compareTo(AbstractFigure o) {
        return this.getSquare() - o.getSquare();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - " + this.getSquare();
    }
}
