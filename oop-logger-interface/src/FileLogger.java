import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLogger implements Logger {
    private final String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String message) {
        try {
            Files.write(Path.of(fileName), List.of(message));
        } catch (IOException e) {
            System.err.println("Error during file writing: " + e.getMessage());
        }
    }
}
