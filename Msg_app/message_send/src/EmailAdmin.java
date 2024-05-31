public class EmailAdmin implements Admin{
    private MessageFactory messageFactory;

    public EmailAdmin(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    @Override
    public void sendCustomMessage(User user, String customMessage) {
        Message emailMessage = messageFactory.createMessage("email");
        emailMessage.sendMessage(user.getName(), "Custom Email: " + customMessage);
    }
}
