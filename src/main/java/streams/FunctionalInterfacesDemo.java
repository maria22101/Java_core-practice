package streams;

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

    }

}
