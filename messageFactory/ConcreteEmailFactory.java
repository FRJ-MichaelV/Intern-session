public class ConcreteEmailFactory implements MessageFactory{
    @Override
    public Message sendNotification(){
        return new ConcreteEmail();
    }
}
