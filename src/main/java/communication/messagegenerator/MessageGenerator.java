package communication.messagegenerator;

import communication.websockets.IClientWebsocket;

public class MessageGenerator implements IMessageGenerator {

    private IClientWebsocket socket;

    public MessageGenerator(IClientWebsocket socket) {
        this.socket = socket;
    }

    public void sendKill() {
        Object msg = new Object();
        socket.send(msg);
    }
}
