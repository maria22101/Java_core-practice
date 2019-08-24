package control_statements;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    void printRectangular() {
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

    void printClosedUsingOneLoop() {
        double consoleReflectionKoef = 1.7;
        int dimKoef = (int) (this.getX() / this.getY() * consoleReflectionKoef);
        String envelopeInnerLine = null;
        String middleSpaceLine = null;

        for (int i = 0; i < this.getY(); i++) {

            if (i == 0 || i == this.getY() - 1) {
                System.out.println(String.format("%0" + this.getX() + "d", 0).replace("0", "*"));

            } else if (i < this.getY() / 2) {
                int countSideSpaces = i * dimKoef - 1;
                if (countSideSpaces > 0) {
                    String side = String.format("%0" + countSideSpaces + "d", 0).replace("0", " ");
                    int countMiddleSpaces = this.getX() - 4 - 2 * side.length();
                    if (countMiddleSpaces > 0) {
                        middleSpaceLine = String.format("%0" + countMiddleSpaces + "d", 0).replace("0", " ");
                        envelopeInnerLine = "*" + String.join("*", side, middleSpaceLine, side) + "*";
                    } else {
                        envelopeInnerLine = "*" + String.join("*", side, side) + "*";
                    }
                }else {
                    int countMiddleSpaces = this.getX() - 4;
                    middleSpaceLine = String.format("%0" + countMiddleSpaces + "d", 0).replace("0", " ");
                    envelopeInnerLine = "*" + middleSpaceLine + "*";
                }
                System.out.println(envelopeInnerLine);

            } else {
                String side = String.format("%0" + (this.getX() - ((i + 1) * dimKoef - 1)) + "d", 0).replace("0", " ");
                String middle = String.format("%0" + (this.getX() - 4 - 2 * side.length()) + "d", 0).replace("0", " ");
                envelopeInnerLine = "*" + String.join("*", side, middle, side) + "*";
                System.out.println(envelopeInnerLine);
            }
        }
    }

}
