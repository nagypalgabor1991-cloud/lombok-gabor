import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 1 and 7:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        sc.close();
        String day = switch (userInput) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input.";
        };
        if (userInput < 1 || userInput > 7) {
            System.err.println(day);
        } else {
            System.out.println(day);
        }
    }
}