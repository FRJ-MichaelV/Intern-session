/*public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase(){
        System.out.println("Saving customer to database: " + name);
    }

    public void sendEmail(String message){
        System.out.println("Sending email to "  + email + ": " + message);
    }
}*/
//here this class does not follow single responsibility principle
//Since the customer class has 2 responsibilities

//Refactor to follow SRP
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //here only implement the responsibilities related to customer only
    //not related to database or email
}