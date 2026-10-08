public class LoginCheck {
    public static void main (String []args){
        String user =  "admin";
        int pin = 2008;
        if (user.equals("admin")){
            if (pin == 1998) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Wrong pin");
            }

        } else {
            System.out.println("Wrong user");
        }
    }
}