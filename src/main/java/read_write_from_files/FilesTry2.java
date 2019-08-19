package read_write_from_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesTry2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:/Users/HP/IdeaProjects/Java Core/Java_core-practice/copyFrom.txt");
        Path path2 = Paths.get("C:/Users/HP/IdeaProjects/1_JavaCore_repeat/Edx Java Object Oriented Progr practice/copyTo");
        Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING); //if copyTo already exists, resuming the program will re-write it

    }
}
