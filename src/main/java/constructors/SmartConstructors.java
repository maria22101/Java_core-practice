package constructors;

//Class that incapsulates array of Strings.
//Create following constructors that will allow creating an instance:
    // new Smart("Alex")
    // new Smart()
    // new Smart(["Alex", "Dima"])
    // new Smart("Alex:Dima", ":") where ":" is the given delimiter
//Write get() method that will return array of Strings of the given length

import java.util.Arrays;

public class SmartConstructors {
    private String[] storage;

    public SmartConstructors(String[] storage) { //primary constructor
        this.storage = storage;
    }

    public SmartConstructors(){
        this(new String[(int) (11 * Math.random())]);
    }

    public SmartConstructors(String s) {
        this();
        storage[0] = s;
    }

    public SmartConstructors(String s, String delimiter) {
        this(s.split(delimiter));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------");
        sb.append(Arrays.toString(this.getStorage()));
        sb.append("--------");
        return sb.toString();
    }

    public String[] getStorage() {
        return storage;
    }

    public String[] get() {
        int len = 0;
        for (String s : this.getStorage()){
            if (s != null) {
                len++;
            }
        }

        String[] result = new String[len];

        int counter = 0;

        for (String s : this.getStorage()){
            if (s != null) {
                result[counter++] = s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SmartConstructors sc1 = new SmartConstructors(new String[] {"apple", "pear", "orange"});
        SmartConstructors sc2 = new SmartConstructors();
        SmartConstructors sc3 = new SmartConstructors("Pomelo");
        SmartConstructors sc4 = new SmartConstructors("plum:nectarine:melon:apricot:strawberry", ":");

        System.out.println(sc1);
        System.out.println(sc2);
        System.out.println(sc3);
        System.out.println(sc4);

        System.out.println(Arrays.toString(sc3.get()));
    }
}
