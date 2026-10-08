import java.util.Scanner;

public class UniversityAdmissionSystem {

    
    public static double calculateTotal(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    
    public static double calculatePercentage(double totalMarks, int totalSubjects) {
        return (totalMarks / (totalSubjects * 100.0)) * 100.0;
    }

    // Method to display student details
    public static void displayDetails(String name, double totalMarks, double percentage) {
        System.out.println("\n--- Admission System Summary ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage  : " + String.format("%.2f", percentage) + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        System.out.println("Enter marks for each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        
        double totalMarks = calculateTotal(marks);
        double percentage = calculatePercentage(totalMarks, numSubjects);

        
        displayDetails(name, totalMarks, percentage);

        
    }
}