package communication.messagehandlers;


import clienthandler.IClientHandler;

public class MessageHandlerFactory implements IMessageHandlerFactory {

    public IMessageHandler getHandler(String simpleType, Object handlerIn) {
        IClientHandler handler = (IClientHandler) handlerIn;

        switch(simpleType){
            case "MessageOrder":
                return new MessageOrderHandler(handler);
            default:
                return null;
        }
    }
}
