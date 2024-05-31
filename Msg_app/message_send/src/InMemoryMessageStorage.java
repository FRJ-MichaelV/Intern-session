public class InMemoryMessageStorage implements MessageStorage{
    private java.util.Map<String, String> messageMap = new java.util.HashMap<>();

    @Override
    public void storeMessage(String recipient, String message) {
        messageMap.put(recipient, message);
    }

    @Override
    public String retrieveMessage(String recipient) {
        return messageMap.get(recipient);
    }
}
