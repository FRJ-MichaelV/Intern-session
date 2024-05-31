import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<User> clients;

    public ClientManager(){
        this.clients = new ArrayList<>();
        initializeClients();
    }

    private void initializeClients(){
        clients.add(new User("Michael", "123", "email"));
        clients.add(new User("Jude", "456", "sms"));
    }

    public List<User> getClients(){
        return clients;
    }
}
