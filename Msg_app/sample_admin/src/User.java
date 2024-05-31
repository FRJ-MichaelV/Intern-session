import java.util.Scanner;

public class User implements UserLogin{
    private String userName;
    private String password;
    private String preference;

    public User(String userName, String password, String preference) {
        this.userName = userName;
        this.password = password;
        this.preference = preference;
    }

    public User(){}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

}
