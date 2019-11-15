package comparable_and_comparator;

public class Square extends AbstractFigure {
    int sideLength;

    public Square(int sideLength) {
        super(4);
        this.sideLength = sideLength;
    }

    @Override
    public int getSquare() {
        return sideLength * sideLength;
    }
}
