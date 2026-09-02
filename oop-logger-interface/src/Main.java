public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("output.log");

        consoleLogger.log("Test message to the console.");
        fileLogger.log("First test message to the file.");
        fileLogger.log("Second test message to the file.");
        fileLogger.log("Third test message to the file.");
    }
}
