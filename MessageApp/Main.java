import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Michael", "vinu", "123@gm.com", 1189045, true, true));
        userList.add(new User("Jude", "dino", "456@gm.com", 7789567, true, false));
        userList.add(new User("Thanu", "bull", "678@gm.com", 895648, false, false));

        //create an admin
        Admin admin = new Admin();

        boolean isAdminLoggedIn = adminLogin(admin);

        if(isAdminLoggedIn) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the user email to send message: ");
            String userEmail = scan.nextLine();

            boolean userExists = false;
            for(UserInterface user: userList){
                if(user.getEmail().equals(userEmail)){
                    userExists = true;
                    break;
                }
            }

            if(userExists) {
                System.out.println("Enter the message to send to " + userEmail + ": ");
                String message = scan.nextLine();

                admin.sendNotification(userList, userEmail, message);

                System.out.println("\nUser login page\n--------------------------");
                UserInterface loggedUser = loginUser(userList);

                if (loggedUser != null) {
                    if(loggedUser.isNeedEmail() && loggedUser.isNeedSms()){
                        System.out.println("Email:: User " + loggedUser.getUserName() + " received message: " +
                                loggedUser.getReceivedMessage());
                        System.out.println("SMS:: User " + loggedUser.getUserName() + " received message: " +
                                loggedUser.getReceivedMessage());
                    } else if (!loggedUser.isNeedEmail() && loggedUser.isNeedSms()) {
                        System.out.println("SMS:: User " + loggedUser.getUserName() + " received message: " +
                                loggedUser.getReceivedMessage());
                    } else if (loggedUser.isNeedEmail() && !loggedUser.isNeedSms()) {
                        System.out.println("Email:: User " + loggedUser.getUserName() + " received message: " +
                                loggedUser.getReceivedMessage());
                    } else {
                        System.out.println("Message received: " + message);
                    }
                }
            } else {
                System.out.println("No user exists with the name: " + userEmail);
                System.exit(0);
            }
        } else{
            System.out.println("Admin login failed");
        }
    }

    private static boolean adminLogin(AuthenticatorInterface admin){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Admin username: ");
        String adminUserName = scan.nextLine();

        System.out.println("Enter Admin password: ");
        String adminPassword = scan.nextLine();

        return admin.authenticate(adminUserName, adminPassword);
    }

    private static UserInterface loginUser(List<User> userList){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String userName = scan.nextLine();

        System.out.println("Enter password: ");
        String password = scan.nextLine();

        for(UserInterface user: userList){
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
                System.out.println("Login successful! Welcome, " + user.getUserName() + ".");
                return user;
            }
        }

        System.out.println("Invalid credentials. Login failed.");
        return null;
    }
}
