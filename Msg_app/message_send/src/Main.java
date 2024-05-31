import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageFactory messageFactory = new MessageFactory();
        AdminLogin adminLogin = new AdminLogin();

        // Create ClientManager to manage clients
        ClientManager clientManager = new ClientManager();

        // Send messages based on user preferences
        MessageSender messageSender = new MessageSender(messageFactory, new InMemoryMessageStorage());

        // Get user input for messages
        Scanner scanner = new Scanner(System.in);

        // Sending messages to clients
        for (Client client : clientManager.getClients()) {
            if (client.authenticate()) {
                System.out.print("Enter message for " + client.getUsername() + ": ");
                String userMessage = scanner.nextLine();
                messageSender.sendMessageToUser(new User(client.getUsername(), "email", client.getPassword()), userMessage);
            } else {
                System.out.println("Invalid client credentials for " + client.getUsername());
            }
        }

        // Admin login and send custom messages
        if (adminLogin.authenticate("admin", "admin123")) {
            Admin emailAdmin = new EmailAdmin(messageFactory);
            Admin smsAdmin = new SmsAdmin(messageFactory);

            System.out.print("Enter custom email message for client1: ");
            String customEmailMessage = scanner.nextLine();
            emailAdmin.sendCustomMessage(new User("client1", "email", "client123"), customEmailMessage);

            System.out.print("Enter custom SMS message for client2: ");
            String customSmsMessage = scanner.nextLine();
            smsAdmin.sendCustomMessage(new User("client2", "sms", "client456"), customSmsMessage);
        } else {
            System.out.println("Invalid admin credentials.");
        }

        // Clients login and view messages
        for (Client client : clientManager.getClients()) {
            if (client.authenticate()) {
                client.viewMessages();
            } else {
                System.out.println("Invalid client credentials for " + client.getUsername());
            }
        }

        // Close the scanner
        scanner.close();
    }
}