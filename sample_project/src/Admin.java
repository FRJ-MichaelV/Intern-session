import java.util.Scanner;

public class Admin implements UserAuthentication{
    private static final String ADMIN_USER_NAME = "admin";
    private static final String ADMIN_EMAIL = "admin123@gmail.com";
    private static final String ADMIN_PASSWORD = "123";

    @Override
    public void authenticate(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name/email: ");
        String name = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        if((ADMIN_USER_NAME.equals(name) || ADMIN_EMAIL.equals(name)) && ADMIN_PASSWORD.equals(password)){
            System.out.println("Welcome admin");;
        }
        else{
            System.out.println("Access denied");
        }
    }
}
