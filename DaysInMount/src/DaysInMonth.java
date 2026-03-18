import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number between 1 and 12 (representing the month)!");
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("The chosen month is 31 days long.");
            case 2 -> System.out.println("The chosen month is 28/29 days long.");
            case 4, 6, 9, 11 -> System.out.println("The chosen month is 30 days long.");
            default -> System.err.println("Invalid input. Good bye!");
        }
        scanner.close();
    }
}