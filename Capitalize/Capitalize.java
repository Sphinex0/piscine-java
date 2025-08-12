import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.print("");
            return;
        }
        String[] content = Arrays.stream(Files.readString(Paths.get(args[0])).split(" "))
                .filter(e -> !e.isEmpty())
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .toArray(String[]::new);
        Files.writeString(Paths.get(args[1]), String.join(" ", content));
    }
}