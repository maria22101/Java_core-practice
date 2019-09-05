package interfaces.calculator;

import interfaces.calculator.Operation;

public final class Divide implements Operation {
    private final int a;
    private final int b;

    public Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int operation() {
        return a / b;
    }
}
