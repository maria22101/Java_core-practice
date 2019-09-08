package inheritance;

public abstract class TwoDimShape {
    private double width;
    private double height;
    private String name;

    public TwoDimShape(){
        width = height = 0.0;
        name = "none";
    }

    public TwoDimShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public TwoDimShape(double x, String name) {
        this.height = this.width = x;
        this.name = name;
    }

    public TwoDimShape(TwoDimShape td){
        width = td.width;
        height = td.height;
        name = td.name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    abstract double area();
}
