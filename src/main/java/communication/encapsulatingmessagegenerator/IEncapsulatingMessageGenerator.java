package communication.encapsulatingmessagegenerator;

import communication.messages.managermessages.EncapsulatingMessage;

public interface IEncapsulatingMessageGenerator {
    EncapsulatingMessage generateMessage(Object content);
    String generateMessageString(Object object);
}
