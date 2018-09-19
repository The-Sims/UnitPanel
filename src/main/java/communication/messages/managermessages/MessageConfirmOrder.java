package communication.messages.managermessages;

public class MessageConfirmOrder {

    int orderId;
    String reason;
    boolean accepted;

    public MessageConfirmOrder(int orderId, String reason, boolean accepted){
        this.orderId=orderId;
        this.reason=reason;
        this.accepted=accepted;
    }

    public int getOrderId(){return orderId;}
    public String getReason() {return reason;}
    public boolean isAccepted(){return accepted;}
}
