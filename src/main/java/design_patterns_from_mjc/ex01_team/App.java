package design_patterns_from_mjc.ex01_team;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var messageSender = new MessageSender();
        messageSender.sendEmail();
        messageSender.lazySendEmail();
    }

}
