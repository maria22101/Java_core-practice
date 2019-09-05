package interfaces.calculator;

public class AddWithHundred extends Add{
    public AddWithHundred(int a, int b) {
        super(a, b);
    }

    @Override
    public int operation() {
        return super.operation() + 100;
    }
}
