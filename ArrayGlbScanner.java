import java.util.Scanner;z

public class ArrayGlbScanner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array (e.g., 20): ");
        int size = scanner.nextInt(); // Read user input
        
        
        int[] numbers = new int[size];
        
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            
            numbers[i] = i + 1;
            
            
            System.out.print(numbers[i] + " "); 
        }
        
        
        scanner.close();
    }
}