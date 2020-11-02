package path04.homework04.api;


import path04.homework04.entity.Message;

public interface Chat {

    Message getMessage(Message message);

    void sendMessage(Message message);

}
