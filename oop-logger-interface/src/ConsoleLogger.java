import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    @Override
    public void log(LogLevel level, String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        String formattedMessage = String.format("[%s] [%s] %s", timestamp, level, message);

        if (level == LogLevel.ERROR) {
            System.err.println(formattedMessage);
        } else {
            System.out.println(formattedMessage);
        }
    }
}
