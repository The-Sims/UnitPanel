package communication.messagegenerator;

import java.util.List;

public interface IMessageGenerator {
    void concludeOrder(int orderId, String conclusion);
    void confirmOrder(String operatorId, String unitId, String unitName, int orderId, String reason, boolean accepted);
    void register(String unitName);
}
