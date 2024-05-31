public class User implements UserInterface{
    private String userName;
    private String password;
    private String email;
    private long telNum;
    private boolean needEmail;
    private boolean needSms;
    private String receivedMessage;

    public User(String userName, String password, String email, long telNum, boolean needEmail, boolean needSms) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.telNum = telNum;
        this.needEmail = needEmail;
        this.needSms = needSms;
        this.receivedMessage = "";
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {

        return password;
    }

    @Override
    public String getEmail() {

        return email;
    }

    @Override
    public long getTelNum() {
        return telNum;
    }

    @Override
    public boolean isNeedEmail() {
        return needEmail;
    }

    @Override
    public boolean isNeedSms() {
        return needSms;
    }

    @Override
    public String getReceivedMessage() {

        return receivedMessage;
    }

    @Override
    public void setReceivedMessage(String receivedMessage) {

        this.receivedMessage = receivedMessage;
    }
}