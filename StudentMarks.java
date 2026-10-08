import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int[] marks = new int[5];

        int total = 0;


        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < marks.length; i++) {

            marks[i] = sc.nextInt();

            total += marks[i];
        }

        double average = (double) total / marks.length;



        System.out.println("Total = " + total);


        System.out.printf("Average = %.2f%n", average);



        
    }
}
