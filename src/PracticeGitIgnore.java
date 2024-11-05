
import java.util.Scanner;
public class PracticeGitIgnore {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first string: ");
            String s1 = scanner.nextLine();


            System.out.print("Enter the second string: ");
            String s2 = scanner.nextLine();


            String result = s1 + s2;


            System.out.println("Concatenated result: " + result);


            scanner.close();
        }
}