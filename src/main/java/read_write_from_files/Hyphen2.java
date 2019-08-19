package read_write_from_files;

import java.io.*;

public class Hyphen2 {

    public static void main(String[] args) {
        int i;

        try (FileReader fr = new FileReader("copyFrom.txt"); FileWriter fw = new FileWriter("copyTo.txt")) {
            do{
                i = fr.read();
                if ((char) i == ' ') i = '-';
                if (i != -1) fw.write(i);
            }while (i != -1);

        }catch (IOException exc) {
            System.out.println("I/O error " + exc);
        }
    }
}
