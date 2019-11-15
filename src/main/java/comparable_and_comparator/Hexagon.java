package comparable_and_comparator;

public class Hexagon extends AbstractFigure {
    int sideLength;

    public Hexagon(int sideLength) {
        super(6);
        this.sideLength = sideLength;
    }

    @Override
    public int getSquare() {
        return (int) (Math.sqrt(3) * sideLength * sideLength / 4 * 6);
    }
}
