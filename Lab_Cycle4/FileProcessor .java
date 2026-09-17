import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileProcessor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        File file = new File("data.txt");

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        int n;

        while (true) {

            try {

                System.out.print("Enter number of lines: ");
                n = input.nextInt();

                if (n > 0) {
                    break;
                }

                System.out.println("Enter a positive number.");

            } catch (InputMismatchException e) {

                System.out.println("Invalid input. Enter an integer.");
                input.next();
            }
        }

        try {

            Scanner fileScanner = new Scanner(file);

            int count = 0;

            while (fileScanner.hasNextLine() && count < n) {

                System.out.println(fileScanner.nextLine());

                count++;
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found: " + e.getMessage());

        } finally {

            input.close();
        }
    }
}