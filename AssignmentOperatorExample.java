import java.util.Scanner;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter a number:");
        int num = Scanner.nextInt();

        // = Assignment operator
        int value = num;
        System.out.println ("\nAfter '=' Assignment: " + value);
        
        value += 10;
        System.out.println("After'+='(Add 10):"+ value);

    
    }
}
