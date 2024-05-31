import java.util.List;

public class Admin implements AuthenticatorInterface{
    private final String adminUserName = "admin";
    private final String adminPassword = "admin123";

    @Override
    public boolean authenticate(String adminName, String adminPwd){
        if(adminUserName.equals(adminName) && adminPassword.equals(adminPwd)){
            System.out.println("Access granted!");
            return adminUserName.equals(adminName) && adminPassword.equals(adminPwd);
        }
        return false;
    }
    public void sendNotification(List<User> userList, String userEmail, String message){
        boolean userFound = false;

        for(User user : userList){
            if(user.getEmail().equals(userEmail)){
                userFound = true;
                if(user.isNeedEmail() && user.isNeedSms()){
                    System.out.println("Sending notification to " + userEmail + " and " + user.getTelNum() + " via email and sms: " + message);
                    user.setReceivedMessage(message);
                    break;
                } else if (!user.isNeedEmail() && user.isNeedSms()) {
                    System.out.println("Sending notification to " + user.getTelNum() + " via sms: " + message);
                    user.setReceivedMessage(message);
                    break;
                } else if (user.isNeedEmail() && !user.isNeedSms()) {
                    System.out.println("Sending notification to " + userEmail + " via email: " + message);
                    user.setReceivedMessage(message);
                    break;
                } else {
                    System.out.println("Message: " + message);
                }
            }
        }

        // Notify if the user does not exist
        if (!userFound){
            System.out.println("No user exists with that email: " + userEmail);
            System.exit(0);
        }
    }
}