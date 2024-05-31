import java.util.Scanner;

public class UserValidation {
    UserLogin user1 = new Admin();
    UserLogin user2 = new User();

    public void adminValidation(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String name = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        user1.authenticate(name, password);
    }

    public void validUser(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String name = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        user2.authenticate(name, password);
    }
}
