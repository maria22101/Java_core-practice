package generics;

public class GenericConstructor {
    int sum;

    <T extends Number> GenericConstructor(T num) {
        sum = 0;
        for (int i = 0; i <= num.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(5);
        System.out.println(genericConstructor.getSum());

        GenericConstructor genericConstructor1 = new GenericConstructor(7.1);
        System.out.println(genericConstructor1.getSum());
    }
}
