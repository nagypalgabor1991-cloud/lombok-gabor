import java.util.Scanner;

public class FirstLoopHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text:");
        String text = scanner.nextLine();
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n < 0) {
            System.err.println("Invalid input.");
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.println(text);
            }
        }
        scanner.close();
    }
}