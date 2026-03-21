import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FunWithFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/lines.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if (line.length() > 4) {
                System.out.println(line);
            }
        }
        sc.close();
    }
}