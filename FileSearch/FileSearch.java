import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSearch {
    public static String searchFile(String fileName) throws IOException {
        return Files.walk(Paths.get("documents"))
                .filter(path -> path.getFileName().toString().equals(fileName))
                .findFirst()
                .map(Path::toString)
                .orElse(null);
    }
}