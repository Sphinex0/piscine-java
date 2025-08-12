import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Cat {
    public static void cat(String[] args) throws IOException {
        System.out.print(args.length == 0 ? "" : new String(Files.readAllBytes(Paths.get(args[0])))); 
        // System.out.print(args.length == 0 ? "" :Files.readAllBytes(Paths.get(args[0])));
    }
}