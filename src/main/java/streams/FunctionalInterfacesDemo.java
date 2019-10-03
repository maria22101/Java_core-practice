package streams;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {

        //Converter - customized functional interface
//        Converter<String, Integer> converter = (from) -> String.valueOf(from);//form with lambda
        Converter<String, Integer> converter1 = String::valueOf; //shorter form
        System.out.println(converter1.convert(123));
        System.out.println(converter1.convert(123).getClass());

        //A class method as a functional interface's method
        FirstCapitalLetter fc = new FirstCapitalLetter();
        Converter<String, String> converter2 = fc::getStringCapitalized;
        System.out.println(converter2.convert("first"));

        //Customized functional interface - factory
        FactoryHuman<Human> fh = Human::new;
        Human h = fh.create(24, "El", "McFerson");

        //Predicate - inner Java's functional interface
        Predicate<String> pr = (p) -> p.length() > 5;
        System.out.println(pr.test("Autumn"));
        System.out.println(pr.negate().test("Autumn"));

        //Function - inner Java's functional interface: the stated function applied
        Function<String, Integer> toInt = Integer::valueOf;
        System.out.println(toInt.apply("12345"));
        System.out.println(toInt.apply("12345").getClass());

        Function<Integer, String> toStr = String::valueOf;
        System.out.println(toStr.apply(123));
        System.out.println(toStr.apply(123).getClass());

        //Supplier - inner Java's functional interface: no arguments are passed, the stated smth got
        Supplier<Human> sh1 = Human::new;
        System.out.println(sh1.get());

        //Consumer - inner Java's functional interface: one argument is passed, nothing returned
        Consumer<Human> ch = (hum) -> System.out.println(hum.getSurname() + ", " + hum.getName());
        ch.accept(new Human(56, "David", "Bowee"));

        //Comparator - inner Java's functional interface
        Human human1 = new Human(48, "Anna-Maria", "Weaver");
        Human human2 = new Human(47, "Martin", "Axon");
        Comparator<Human> comp = new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
        System.out.println(comp.compare(human1, human2));
    }

}
