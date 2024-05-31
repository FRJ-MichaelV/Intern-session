public class ConcreteEmail implements Message{
    @Override
    public void sendClient(){
        System.out.println("Email received");
    }
}
