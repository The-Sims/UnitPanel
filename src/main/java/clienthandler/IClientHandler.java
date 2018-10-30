package clienthandler;

public interface IClientHandler {
    void order(String sessionId, String incidentTitle, int orderId, String location);
}
