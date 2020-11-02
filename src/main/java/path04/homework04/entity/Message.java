package path04.homework04.entity;

public class Message {

    private final String creator;

    private final String destination;

    private String textMessage;

    public Message(String creator, String destination, String textMessage) {
        this.creator = creator;
        this.destination = destination;
        this.textMessage = textMessage;
    }

    public String getCreator() {
        return creator;
    }

    public String getDestination() {
        return destination;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

}
