package read_write_from_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hyphen {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

//        if (args.length != 2) {
//            System.out.println("Usage: read_write_from_files.Hyphen From To");
//            return;
//        }

        try {
            fin = new FileInputStream("copyFrom.txt");
            fout = new FileOutputStream("copyTo.txt");

            do{
                i = fin.read();
                if ((char) i == ' ') i = '-';
                if (i != -1) fout.write(i);
            }while (i != -1);

        }catch (IOException exc) {
            System.out.println("I/O error " + exc);
        }finally {
            try{
                if (fin != null) fin.close();
            }catch (IOException exc){
                System.out.println("Error closing input file.");
            }

            try{
                if (fout != null) fout.close();
            }catch (IOException exc){
                System.out.println("Error closing output file.");
            }
        }
    }
}
