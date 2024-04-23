package chapter14And15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
//    TODO: java.io and java.nio
    public static void main(String[] args) {

        try {
//        step 1
            Path path = Paths.get("/home/user/Desktop/maxproduct/src/chapter14And15/sample.txt");
            System.out.println(path.getRoot());
//        step 2
           // Files.createFile(path);
            Files.deleteIfExists(path);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
