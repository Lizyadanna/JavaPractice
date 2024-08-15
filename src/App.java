
import java.util.Scanner;

class App {
    public static void main(String[] args) {

        // Declare variables
        long startTime, endTime;
        String userInput;

        // Create Scanner Class to read users input
        Scanner scanner = new Scanner(System.in);

        // Start timer
        startTime = System.nanoTime();

        // Prompt user to type and scan user input
        System.out.println("Type these teams: Bulls, Hawks, Sky, Lakers");
        userInput = scanner.nextLine();

        // End timer
        endTime = System.nanoTime();

        // Calculate time difference then convert to seconds from nanoseconds

        double elapsedTime = (double) (endTime - startTime) / 1_000_000_000;

        // Output users time used using elapsedTime variable and userInput variable.
        System.out.println("It took you " + elapsedTime + "seconds to type " + userInput + ". Congratulations");

        // Close scanner
        scanner.close();

    }
}