public class MessageSender {
    private MessageFactory messageFactory;
    private MessageStorage messageStorage;

    public MessageSender(MessageFactory messageFactory, MessageStorage messageStorage) {
        this.messageFactory = messageFactory;
        this.messageStorage = messageStorage;
    }

    public void sendMessageToUser(User user, String message) {
        Message userMessage = messageFactory.createMessage(user.getPreference());
        userMessage.sendMessage(user.getName(), message);

        // Store the message for the user
        messageStorage.storeMessage(user.getName(), message);
    }
}
