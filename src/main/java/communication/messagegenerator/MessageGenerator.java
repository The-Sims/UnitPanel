package communication.messagegenerator;

import communication.messages.managermessages.MessageConcludeOrder;
import communication.messages.managermessages.MessageConfirmOrder;
import communication.messages.managermessages.MessageRegister;
import communication.websockets.IClientWebsocket;

public class MessageGenerator implements IMessageGenerator {

    private IClientWebsocket socket;

    public MessageGenerator(IClientWebsocket socket) {
        this.socket = socket;
    }

    @Override
    public void concludeOrder(int orderId, String conclusion) {
        MessageConcludeOrder msg = new MessageConcludeOrder(orderId, conclusion);
        socket.send(msg);
    }

    @Override
    public void confirmOrder(String operatorId, String unitId, String unitName, int orderId, String reason, boolean accepted) {
        MessageConfirmOrder msg = new MessageConfirmOrder(operatorId, unitId, unitName, orderId, reason, accepted);
        socket.send(msg);
    }

    @Override
    public void register(String unitName) {
        MessageRegister msg = new MessageRegister(unitName);
        socket.send(msg);
    }
}
