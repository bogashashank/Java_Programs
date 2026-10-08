import java.util.Scanner;
public class RelationalOperatorExtension {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.println("a == b: " + (a == b));
            System.out.println("a != b: " + (a != b));
            System.out.println("a > b: " + (a > b));
            System.out.println("a < b: " + (a < b));
            System.out.println("a >= b: " + (a >= b));
            System.out.println("a <= b: " + (a <= b));
        }
    }
}