public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("output.log");

        consoleLogger.log("Test message to the console.");

        fileLogger.log(LogLevel.INFO, "Test message to the file.");
        fileLogger.log(LogLevel.WARN, "Something might be wrong.");
        fileLogger.log(LogLevel.ERROR, "Critical error occurred in the system!");
    }
}