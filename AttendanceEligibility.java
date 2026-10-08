import java.util.Scanner;

public class AttendanceEligibility {
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Attendence percentage");
        double attendence = Scanner.nextDouble();
        if (attendence >= 75){
            
            System.out.println("Eligible for semester exam");
        } else {
            System.out.println("Not ELigible for semester exam");
        }
    }

    
}
