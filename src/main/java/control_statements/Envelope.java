package control_statements;

public class Envelope { //consoleReflectionKoef - to be adjusted for proper diagonal reflection (depends on the dimensions)
    int length;
    int width;

    public Envelope(int x, int y) {
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
        double consoleReflectionKoef = 1.7;
        int dimKoef = (int) (this.getX() / this.getY() * consoleReflectionKoef);
        return j == i * dimKoef || j == this.getX() - 1 - i * dimKoef;
    }

    boolean isBorder(int i, int j) {
        return i == 0 || i == this.getY() - 1 || j == 0 || j == this.getX() - 1;
    }

    void printClosed() {
        int l = this.getX();
        int h = this.getY();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (this.isBorder(i, j) || this.isDiagonal(i, j)) {
                    this.printStar();
                } else {
                    this.printSpace();
                }
            }
            System.out.println();
        }
    }

    void printRectangular(){
        for (int i = 0; i < this.getY(); i++) {
            for (int j = 0; j < this.getX(); j++) {
                if (this.isBorder(i, j)) {
                    this.printStar();
                } else {
                    this.printSpace();
                }
            }
            System.out.println();
        }
    }

    void printOpen() {
        for (int i = (int) (this.getY() / 2); (int) i < this.getY(); i++) {
            for (int j = 0; j < this.getX(); j++) {
                if (this.isDiagonal(i, j)) {
                    this.printStar();
                } else {
                    this.printSpace();
                }
            }
            System.out.println();
        }
        printRectangular();
    }
}
