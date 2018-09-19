package communication.messages.analysermessages;

public class RequestInfoMessage {
    int orderId;

    public RequestInfoMessage(int orderId){
        this.orderId=orderId;
    }

    public int getOrderId(){return orderId;}
}
