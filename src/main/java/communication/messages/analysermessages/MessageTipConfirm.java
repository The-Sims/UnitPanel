package communication.messages.analysermessages;

public class MessageTipConfirm {
    int orderId;
    String tip;

    public MessageTipConfirm(int orderId, String tip){
        this.orderId=orderId;
        this.tip=tip;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getTip() {
        return tip;
    }
}
