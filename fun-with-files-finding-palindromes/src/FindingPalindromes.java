import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindingPalindromes {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please enter the file path::");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String[] lines = convertLinesToArray(path);
        System.out.println("Palindromic lines:");
        for (String line : lines) {
            if (isPalindrome(line)) {
                System.out.println(line);
            }
        }
        sc.close();
    }

    public static String[] convertLinesToArray(String path) throws FileNotFoundException {
        File file = new File(path);
        int numberOfLines = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            sc.nextLine();
            numberOfLines++;
        }
        sc.close();
        String[] lines = new String[numberOfLines];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < numberOfLines; i++) {
            lines[i] = scanner.nextLine();
        }
        scanner.close();

        return lines;
    }

    public static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < (length / 2); i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}