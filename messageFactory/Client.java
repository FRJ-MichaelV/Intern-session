public class Client {
    public static void main(String[] args){
        // Using sms factory to create sms
        ConcreteEmailFactory emailFactory = new ConcreteEmailFactory();
        Message email = emailFactory.sendNotification();
        email.sendClient();

        // Using email factory to create email
        ConcreteSmsFactory smsFactory = new ConcreteSmsFactory();
        Message sms = smsFactory.sendNotification();
        sms.sendClient();
    }
}
