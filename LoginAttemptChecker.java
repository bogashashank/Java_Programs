public class LoginAttemptChecker {
    public static void main (String[] args);{
        Scanner scn = new Scanner(System.in);
            String correct password = "uniflow123";
            int attempts = 0;
            boolean access Granted = "false";\
            
            while (attempts < 3) {
                System.out.print("Enter Password:");
                String input = sc.nextline();
                attempts++
                
                 if (input.equals(correct password)) {
                    access Granted = true;
                    break;
                 } else {
                    System.out.println("Incorrect Password")
                 }
            }
            if (access Granted){
                System.out.println("Incorrect Password")
            }
    }
    
}
