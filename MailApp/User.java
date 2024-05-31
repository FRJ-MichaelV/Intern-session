public class User implements UserInterface{
    private String userName;
    private String password;
    private String email;
    private String receivedMessage;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.receivedMessage = "";
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getReceivedMessage() {
        return receivedMessage;
    }

    @Override
    public void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }
}
