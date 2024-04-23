import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
//    TODO: java.io and java.nio
    public static void main(String[] args) {
//    paths
//    windows => \DELL\Desktop\
//    unix => /home/user/Desktop/...
        try {
//        step 1
            Path path = Paths.get("/home/user/Desktop/maxproduct/src/sample.txt");
            System.out.println(path.getRoot());
//        step 2
            Files.createFile(path);
            Files.deleteIfExists(path);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
