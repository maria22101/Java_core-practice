package read_write_from_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesTry1 {
    public static void main(String[] args) {

        Path path = Paths.get("C:/Users/HP/IdeaProjects/Java Core/Java_core-practice/copyFrom.txt");

        try{
            Object obj = Files.getAttribute(path, "creationTime"); //when the file copyFrom.txt was created
            System.out.println(obj);
            System.out.println(Files.getAttribute(path, "size")); //what is this file's size
            System.out.println(Files.getAttribute(path, "isDirectory")); //is this file a directory?

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
