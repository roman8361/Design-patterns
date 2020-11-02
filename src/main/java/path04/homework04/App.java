package path04.homework04;


import path04.homework04.api.Chat;
import path04.homework04.service.EncryptionMessageService;
import path04.homework04.service.EncryptionUsersService;
import path04.homework04.service.MessageFactoryImpl;
import path04.homework04.service.PrimeChat;

public class App {

    public static void main(String[] args) {
        Chat chat = new PrimeChat();
        var messageFactory = new MessageFactoryImpl();
        var message = messageFactory.crateMessage("iVaN", "Botan666", "Как жизнь на Марсе?");

        chat.sendMessage(message);
        var gettingMessage = chat.getMessage(message);
        System.out.println(gettingMessage.getTextMessage());

        System.out.println("********************");

        var encryptionUser = new EncryptionUsersService(chat);
        encryptionUser.sendMessage(message);

        System.out.println("********************");

        var encryptionMessage = new EncryptionMessageService(chat);
        encryptionMessage.sendMessage(message);
    }

}
