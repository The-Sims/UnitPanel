package communication.messages.managermessages;

public class MessageRegister {
    String unitName;

    public MessageRegister(String unitName){
        this.unitName=unitName;
    }

    public String getUnitName() {return unitName;}
}
