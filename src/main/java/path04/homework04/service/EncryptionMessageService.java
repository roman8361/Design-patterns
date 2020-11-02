package path04.homework04.service;


import path04.homework04.api.Chat;
import path04.homework04.entity.Message;

public class EncryptionMessageService implements Chat {

    private static final String TEG = "<tr>";

    private final Chat chat;

    public EncryptionMessageService(Chat chat) {
        this.chat = chat;
    }

    @Override
    public Message getMessage(Message message) {
        return chat.getMessage(message);
    }

    @Override
    public void sendMessage(Message message) {
        chat.getMessage(message).setTextMessage(TEG + message.getTextMessage() + TEG);
        System.out.println(message.getTextMessage());
    }

}
