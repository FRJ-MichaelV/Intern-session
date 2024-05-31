public class SmsAdmin implements Admin{
    private MessageFactory messageFactory;

    public SmsAdmin(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    @Override
    public void sendCustomMessage(User user, String customMessage) {
        Message smsMessage = messageFactory.createMessage("sms");
        smsMessage.sendMessage(user.getName(), "Custom SMS: " + customMessage);
    }
}
