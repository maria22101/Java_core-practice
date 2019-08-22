package arrays;

public class EnvelopeClosed { //print a closed envelope. consoleReflectionCoef - to be adjusted for proper diagonal
    //reflection depending on the dimensions
    int length;
    int width;

    public EnvelopeClosed(int x, int y) {
        this.length = x;
        this.width = y;
    }

    public int getX() {
        return length;
    }

    public int getY() {
        return width;
    }

    void printStar() {
        System.out.print("*");
    }

    void printSpace() {
        System.out.print(" ");
    }

    boolean isDiagonal(int i, int j) {
        double consoleReflectionCoef = 1.8;
        int dimKoef = (int) (this.getX() / this.getY() * consoleReflectionCoef);
        return j == i * dimKoef || j == this.getX() - 1 - i * dimKoef;
    }

    boolean isBorder(int i, int j) {
        return i == 0 || i == this.getY() - 1 || j == 0 || j == this.getX() - 1;
    }

    void print() {
        int l = this.getX();
        int h = this.getY();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (this.isBorder(i, j)) {
                    this.printStar();
                } else if (this.isDiagonal(i, j)){
                    this.printStar();
                }else {
                    this.printSpace();
                }
                }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EnvelopeClosed e = new EnvelopeClosed(22, 8);
        e.print();
    }
}
