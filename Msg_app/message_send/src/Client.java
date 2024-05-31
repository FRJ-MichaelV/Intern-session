public class Client {
    private String username;
    private String password;
    private MessageStorage messageStorage;

    public Client(String username, String password, MessageStorage messageStorage) {
        this.username = username;
        this.password = password;
        this.messageStorage = messageStorage;
    }

    public boolean authenticate() {
        // Perform client authentication based on username and password
        // In a real application, you might use a database for authentication
        return "client".equals(username) && "client123".equals(password);
    }

    public void viewMessages() {
        // Retrieve and display messages for the client
        String message = messageStorage.retrieveMessage(username);
        if (message != null) {
            System.out.println("Message for " + username + ": " + message);
        } else {
            System.out.println("No messages for " + username);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
