package path04.homework04.service;

import path04.homework04.api.Chat;
import path04.homework04.entity.Message;

public class PrimeChat implements Chat {

    @Override
    public Message getMessage(Message message) {
        return message;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Соощение отправлено от : " + message.getCreator());
        System.out.println("Соощение отправлено пользователю: " + message.getDestination());
    }

}
