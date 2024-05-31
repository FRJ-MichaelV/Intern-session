import java.util.List;

public class Main {
    public static void main(String[] args){
        // initialize database
        Database database = new Database();

        //Initialize NotificationService
        NotificationService notificationService = new NotificationService();

        //fetch users from the database
        List<User> users = database.getUsers();
        users.forEach(user -> user.setNotificationService(notificationService));

        //Initialize email service
        EmailService emailService = new EmailService();

        //send an email to user
        for (User user : users) {
            String message = "Hello, " + user.getName() + "! This is a test email.";
            emailService.sendEmail(user, message);
            user.receiveEmailNotification(message);
        }
    }
}
