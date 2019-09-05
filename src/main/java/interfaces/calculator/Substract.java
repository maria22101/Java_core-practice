package interfaces.calculator;

public final class Substract implements Operation {
    private final int a;
    private final int b;

    public Substract(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int operation() {
        return a - b;
    }
}
