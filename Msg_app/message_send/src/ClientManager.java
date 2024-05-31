import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<Client> clients;

    public ClientManager() {
        this.clients = new ArrayList<>();
        initializeClients();
    }

    private void initializeClients() {
        clients.add(new Client("client1", "client123", new InMemoryMessageStorage()));
        clients.add(new Client("client2", "client456", new InMemoryMessageStorage()));
        // Add more clients as needed
    }

    public List<Client> getClients() {
        return clients;
    }
}
