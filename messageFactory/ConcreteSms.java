public class ConcreteSms implements Message{
    @Override
    public void sendClient(){
        System.out.println("SMS received");
    }
}
