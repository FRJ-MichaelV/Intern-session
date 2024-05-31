public class EmailService {
    public void sendEmail(User user, String message){
        //simulate sending an email
        System.out.println("Sending email to: " + user.getEmail());
        System.out.println("Message: " + message);
        //Actual email sending logic would be implemented here
    }
}
