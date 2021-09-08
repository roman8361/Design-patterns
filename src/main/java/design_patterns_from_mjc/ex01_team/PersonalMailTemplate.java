package design_patterns_from_mjc.ex01_team;

public class PersonalMailTemplate implements MailTemplate{

    @Override
    public String getTemplate() {
        return "Hi may dear friend";
    }

}
