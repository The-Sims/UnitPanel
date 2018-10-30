package communication.messagehandlers;

import clienthandler.IClientHandler;
import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class MessageHandler<T> implements IMessageHandler {
    IClientHandler handler;

    public MessageHandler(IClientHandler clientHandler){
        this.handler = handler;
    }

    public IClientHandler getHandler() {
        return handler;
    }

    public void handleMessage(String data, String sessionId, Gson gson){
        Type type = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        T msg = gson.fromJson(data, type);
        handleMessageInternal(msg, sessionId);
    }

    public abstract void handleMessageInternal(T message, String sessionId);
}
