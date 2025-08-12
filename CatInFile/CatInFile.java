import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.print("");
            return;
        }
        Files.write(Paths.get(args[0]),System.in.readAllBytes());
    }
}