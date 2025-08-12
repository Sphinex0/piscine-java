import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        Files.writeString(Files.createFile(Paths.get(fileName)), content);
    }

    public static String getContentFile(String fileName) throws IOException {
        return Files.readString(Paths.get(fileName));
    }

    public static void deleteFile(String fileName) throws IOException {
        Files.deleteIfExists(Paths.get(fileName));
    }
}
