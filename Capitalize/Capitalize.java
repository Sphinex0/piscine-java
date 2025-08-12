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
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .toArray(String[]::new);
        // String output = String.join(" ",content).toArray());
         Files.writeString(Paths.get(args[1]),String.join(" ",content));
    }
}