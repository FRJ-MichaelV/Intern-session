public class ConcreteSmsFactory implements MessageFactory{
    @Override
    public Message sendNotification(){
        return new ConcreteSms();
    }
}
