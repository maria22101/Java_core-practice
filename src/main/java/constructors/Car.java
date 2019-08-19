package constructors;

public class Car { //class variables are not exposed, but assigned in the constructor
    private final String brand;
    private final int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Car car = new Car("Opel", 5000);
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
    }
}
