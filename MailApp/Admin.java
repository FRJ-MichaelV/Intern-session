public class Admin {
    private final String adminName = "admin";
    private final String adminPassword = "admin";

    public boolean authenticate(String aName, String aPassword){
        System.out.println("Access granted");
        return adminName.equals(aName) && adminPassword.equals(aPassword);
    }


}
