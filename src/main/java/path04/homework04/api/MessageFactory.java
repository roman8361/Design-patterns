package path04.homework04.api;


import path04.homework04.entity.Message;

public interface MessageFactory {

    Message crateMessage(String creator, String destination, String testMessage);

}
