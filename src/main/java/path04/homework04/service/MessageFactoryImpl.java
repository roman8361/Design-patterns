package path04.homework04.service;


import path04.homework04.api.MessageFactory;
import path04.homework04.entity.Message;

public class MessageFactoryImpl implements MessageFactory {

    @Override
    public Message crateMessage(String creator, String destination, String testMessage) {
        return new Message(creator, destination, testMessage);
    }

}
