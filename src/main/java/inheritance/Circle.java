package inheritance;

public class Circle extends TwoDimShape {

    Circle(){
        super();
    }

    Circle(double x, String s){
        super(x, s);
    }

    Circle(Circle c){
        super(c);
    }

    @Override
    double area() {
        return 3.1416 * getWidth() / 2 * getWidth() / 2;
    }
}
