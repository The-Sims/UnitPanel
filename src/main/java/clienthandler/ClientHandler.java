package clienthandler;

import communication.messagegenerator.IMessageGenerator;

public class ClientHandler implements IClientHandler {
    IMessageGenerator messageGenerator;

    public ClientHandler(IMessageGenerator messageGenerator){this.messageGenerator=messageGenerator;}

    @Override
    public void order(String sessionId, String incidentTitle, int orderId, String location) {

    }
}
