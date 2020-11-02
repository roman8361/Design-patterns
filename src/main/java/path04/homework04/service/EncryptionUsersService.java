package path04.homework04.service;


import path04.homework04.api.Chat;
import path04.homework04.entity.Message;

public class EncryptionUsersService implements Chat {

    private final Chat chat;

    public EncryptionUsersService(Chat chat) {
        this.chat = chat;
    }

    @Override
    public Message getMessage(Message message) {
        return chat.getMessage(message);
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Соощение отправлено от : " + chat.getMessage(message).getCreator().hashCode());
        System.out.println("Соощение отправлено пользователю: " + chat.getMessage(message).getDestination().hashCode());
    }

}
