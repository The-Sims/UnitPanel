package communication.messages.analysermessages;

public class MessageRequestInfo {
    int orderId;

    public MessageRequestInfo(int orderId){
        this.orderId=orderId;
    }

    public int getOrderId(){return orderId;}
}
