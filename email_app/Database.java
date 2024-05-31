import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<User> users;

    public Database(){
        this.users = new ArrayList<>();
        initializeData(); //Hardcoded data initialization
    }

    private void initializeData(){
        //add more hardcoded data as needed
        users.add(new User("Michael", "michael10@gmail;.com"));
        users.add(new User("Vinushan", "vinushan11@gmail.com"));
    }

    public List<User> getUsers(){
        return users;
    }
}
