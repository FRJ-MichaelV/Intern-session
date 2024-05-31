public interface MessageStorage {
    void storeMessage(String recipient, String message);
    String retrieveMessage(String recipient);
}
