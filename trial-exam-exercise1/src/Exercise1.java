import java.io.InputStream;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        for (int i = 1; i <= input; i++) {
            if (hasMax3Divisors(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean hasMax3Divisors(int number) {
        int counter = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
        }
        return true;
    }
}