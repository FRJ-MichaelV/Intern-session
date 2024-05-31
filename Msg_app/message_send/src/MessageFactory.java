public class MessageFactory {
    public Message createMessage(String preference) {
        if ("email".equalsIgnoreCase(preference)) {
            return new EmailMessage();
        } else if ("sms".equalsIgnoreCase(preference)) {
            return new SmsMessage();
        } else {
            throw new IllegalArgumentException("Invalid preference: " + preference);
        }
    }
}
