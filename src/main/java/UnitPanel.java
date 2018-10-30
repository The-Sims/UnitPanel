import clienthandler.ClientHandler;
import clienthandler.IClientHandler;
import communication.messagegenerator.IMessageGenerator;
import communication.messagegenerator.MessageGenerator;
import communication.messagehandlers.IMessageHandlerFactory;
import communication.messagehandlers.MessageHandlerFactory;
import communication.messageprocessor.IMessageProcessor;
import communication.messageprocessor.MessageProcessor;
import communication.websockets.ClientWebsocket;
import communication.websockets.IClientWebsocket;

public class UnitPanel {
    public static void main(String[] args) {
        IClientWebsocket socket = new ClientWebsocket();
        IMessageGenerator messageGenerator = new MessageGenerator(socket);
        IMessageHandlerFactory factory = new MessageHandlerFactory();
        IClientHandler clientHandler = new ClientHandler(messageGenerator);
        IMessageProcessor messageProcessor = new MessageProcessor(factory, clientHandler);
        socket.setMessageHandler(messageProcessor);
        socket.start();

        //all other starting thingies
    }
}
