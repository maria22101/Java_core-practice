package comparable_and_comparator;

public class Triangle extends AbstractFigure {
    int sideLength;

    public Triangle(int sideLength) {
        super(3);
        this.sideLength = sideLength;
    }

    @Override
    public int getSquare() {
        return (int) (Math.sqrt(3) * sideLength * sideLength / 4);
    }
}
