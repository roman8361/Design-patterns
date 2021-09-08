package design_patterns_from_mjc.ex01_team;

import java.lang.reflect.InvocationTargetException;

public class MessageSender {

    private static final int TYPE_PERSONAL = 0;

    private static final int TYPE_BUSINESS = 1;

    protected void sendEmail() {
        int emailTemplate = 0;
        var template = MessageType.getTemplateByCode(emailTemplate).getTemplate();
        System.out.println("sendEmail: " + template);
        //todo late template sender to address
    }

    protected void lazySendEmail() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        int emailTemplate = 1;
        String template = LazyMessageType.getTemplateByCode(emailTemplate).getTemplate();
        System.out.println("lazySendEmail: " + template);
    }

    private void badSolutionEmailSender() {
        int emailTemplate = 1;
        String template;
        if (emailTemplate == TYPE_PERSONAL) {
            //todo any code...
            template = "aaaa";
        } else if (emailTemplate == TYPE_BUSINESS) {
            //todo any code..
            template = "dddd";
        }
        //todo late template sender to address
    }

}
