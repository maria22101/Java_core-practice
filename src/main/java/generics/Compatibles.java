package generics;

public class Compatibles <T extends Number> {
    T a;

    public Compatibles(T a) {
        this.a = a;
    }

    double reciprocal() {
        return 1 / a.doubleValue();
    }

    double fraction() {
        return a.doubleValue() - a.intValue();
    }

    boolean isEqual(Compatibles<?> comp) {
        if (Math.abs(a.doubleValue()) == Math.abs(comp.a.doubleValue())) return true;
        return false;
    }

    public static void main(String[] args) {
        Compatibles<Integer> integerCompatibles = new Compatibles<Integer>(10);
        System.out.println(integerCompatibles.reciprocal());
        System.out.println(integerCompatibles.fraction());

        Compatibles<Double> doubleCompatibles = new Compatibles<>(15.5);
        System.out.println(doubleCompatibles.reciprocal());
        System.out.println(doubleCompatibles.fraction());

        Compatibles<Double> doubleCompatibles2 = new Compatibles<>(-10.0);
        Compatibles<Long> longCompatibles = new Compatibles<>(10L);
        System.out.println(integerCompatibles.isEqual(doubleCompatibles2));
        System.out.println(integerCompatibles.isEqual(longCompatibles));
        System.out.println(doubleCompatibles2.isEqual(integerCompatibles));
        System.out.println(doubleCompatibles2.isEqual(longCompatibles));
        System.out.println(longCompatibles.isEqual(integerCompatibles));
        System.out.println(longCompatibles.isEqual(doubleCompatibles2));
    }
}
