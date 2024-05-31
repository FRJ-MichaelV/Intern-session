import java.util.Scanner;

public class Admin implements UserLogin{
    private static final String ADMIN_USER_NAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    @Override
    public String authenticate(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String name = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        if(ADMIN_USER_NAME.equals(name) && ADMIN_PASSWORD.equals(password)){
            return "Access granted";
        }
        else{
            return "Access denied";
        }
    }

}
