package design_patterns_from_mjc.ex01_team;

import java.util.Arrays;

public enum MessageType {

    PERSONAL(0, new PersonalMailTemplate()), BUSINESS (1, new BusinessMailTemplate());

    private int typeCode;
    private MailTemplate mailTemplate;

    MessageType(int typeCode, MailTemplate mailTemplate) {
        this.typeCode = typeCode;
        this.mailTemplate = mailTemplate;
    }

    public static MailTemplate getTemplateByCode(int code){
        for (MessageType type : MessageType.values()) {
            if (type.typeCode == code) {
                return type.mailTemplate;
            }
        }
        throw new RuntimeException("Code not found!!");
    }

    public MailTemplate getMailTemplate() {
        return mailTemplate;
    }

}
