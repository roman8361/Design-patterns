package design_patterns_from_mjc.ex01_team;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

//todo Ленивая инициализация MailTemplate для экономии памяти))
public enum LazyMessageType {

    PERSONAL(0, PersonalMailTemplate.class), BUSINESS (1, BusinessMailTemplate.class);

    private int typeCode;
    Class<? extends MailTemplate> template;

    LazyMessageType(int typeCode, Class<? extends MailTemplate> template) {
        this.typeCode = typeCode;
        this.template = template;
    }

    public static MailTemplate getTemplateByCode(int code) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException { //todo переделать на стрим
        for (LazyMessageType type : LazyMessageType.values()) {
            if (type.typeCode == code) {
                return type.template.getDeclaredConstructor().newInstance();
            }
        }

        throw new RuntimeException("Code not found!!");
    }

    public MailTemplate getMailTemplate() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return template.getDeclaredConstructor().newInstance();
    }

}
