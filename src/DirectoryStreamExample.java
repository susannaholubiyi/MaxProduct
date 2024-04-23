import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {
    public static void main(String[] args) {
        Path path = Paths.get("/home/user/Desktop");

       try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)){
           directoryStream.forEach(System.out::println);
       }catch (IOException e){
           System.err.println(e.getMessage());
           e.printStackTrace();
       }
    }
}
