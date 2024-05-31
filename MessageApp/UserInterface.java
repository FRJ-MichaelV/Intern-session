public interface UserInterface {
    String getUserName();
    String getPassword();
    String getEmail();
    String getReceivedMessage();
    long getTelNum();
    boolean isNeedEmail();
    boolean isNeedSms();
    void setReceivedMessage(String receivedMessage);
}
