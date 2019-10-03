package streams;

public interface FactoryHuman<P extends Human> {
    P create(int age, String name, String surname);
}
