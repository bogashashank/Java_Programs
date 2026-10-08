import java.util.Scanner;

class MovieTicket {

    // Data members
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

  
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

  
    void displayBill() {
        System.out.println("\n=================================");
        System.out.println("       CINEMA TICKET BILL          ");
        System.out.println("=================================");

        System.out.println("Movie Name       : " + movieName);
        System.out.printf("Ticket Price     : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);

        System.out.println("---------------------------------");

        System.out.printf("Total Amount     : %.2f%n", calculateTotal());
        System.out.printf("Discount         : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount     : %.2f%n", calculateFinalAmount());

        System.out.println("=================================");
        System.out.println("  Thank You! Enjoy the Movie"     );
        System.out.println("=================================");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = sc.nextInt();

        
        MovieTicket ticket = new MovieTicket(
                movieName, ticketPrice, numberOfTickets
        );

       
        ticket.displayBill();

        
    }
}