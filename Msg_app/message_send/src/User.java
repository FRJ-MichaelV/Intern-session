public class User {
    private String name;
    private String preference;
    private String password;

    public User(String name, String preference, String password) {
        this.name = name;
        this.preference = preference;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPreference() {
        return preference;
    }

    public String getPassword() {
        return password;
    }
}
