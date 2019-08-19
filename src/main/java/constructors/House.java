package constructors;

import java.util.ArrayList;
import java.util.Objects;

public class House { // chain of constructors example
    private final int type1;
    private final int type2;
    private final int type3;

    public House(int type1, int type2){//variation of the constructor - variation_1 (and then primary) constructors used
        this(type1, type2, 33);
    }

    public House(int type3){ //variation of the constructor - variation_1 (and then primary) constructors used
        this(11, 22, type3);
    }

    public House(int type1, int type2, int type3){ //variation_1 of the constructor - primary constructor used
        this(new ArrayList<Integer>(){{add(type1);add(type2);add(type3);}});
    }

    public House(ArrayList<Integer> arr){ //class variable initialized here, in primary constructor
        this.type1 = arr.get(0);
        this.type2 = arr.get(1);
        this.type3 = arr.get(2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return type1 == house.type1 &&
                type2 == house.type2 &&
                type3 == house.type3;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type1, type2, type3);
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(22);
        a.add(33);
        House h1 = new House(a);
        House h2 = new House(111, 222, 333);
        House h3 = new House(3333);
        House h4 = new House(11111, 22222);

        System.out.println(h1.type1); //11
        System.out.println(h2.type1); //111
        System.out.println(h3.type2); //22
        System.out.println(h4.type3); //33

    }
}
