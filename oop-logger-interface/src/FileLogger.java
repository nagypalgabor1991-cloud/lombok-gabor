import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements Logger {
    private final String fileName;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        String formattedMessage = String.format("[%s] [%s] %s%s", timestamp, level, message, System.lineSeparator());

        try {
            Files.writeString(Path.of(this.fileName), formattedMessage, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error during file writing: " + e.getMessage());
        }
    }
}