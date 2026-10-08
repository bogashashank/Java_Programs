import java.util.Scanner;


public class WaterBillCalc {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter water consumption in liters:");
        double waterConsumption = scanner.nextDouble();

        double bill;

        if (waterConsumption <= 500){

            bill = 100.0;
        } else {

            bill = 200.0;


        } 

        System.out.println("Total water bill: $" + bill);
        

        
    }


    
}
