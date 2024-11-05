//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class PracticeGitIgnore {

        public static void main(String[] args) {
            // Create a scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the first string
            System.out.print("Enter the first string: ");
            String s1 = scanner.nextLine();

            // Prompt the user to enter the second string
            System.out.print("Enter the second string: ");
            String s2 = scanner.nextLine();

            // Concatenate the two strings
            String result = s1 + s2;

            // Print the concatenated result
            System.out.println("Concatenated result: " + result);

            // Close the scanner
            scanner.close();
        }
}