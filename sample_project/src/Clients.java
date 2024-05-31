import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clients implements UserAuthentication{
    private List<User> clients = new ArrayList<>();

    public void addClients(){
        User u1 = new User("Michael", "123@gmail.com", "123");
        User u2 = new User("Jude", "456@gmail.com", "456");
        User u3 = new User("Thanu", "678@gmail.com", "678");

        clients.add(u1);
        clients.add(u2);
        clients.add(u3);
    }

    @Override
    public void authenticate(){
        addClients();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String name = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        for(User c1: clients){
            if(c1.getUserName().equals(name) && c1.getPassword().equals(password)){
                System.out.println("User access granted");
            }
        }
    }
}
