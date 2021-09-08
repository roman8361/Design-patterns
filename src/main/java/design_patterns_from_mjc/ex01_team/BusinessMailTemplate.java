package design_patterns_from_mjc.ex01_team;

public class BusinessMailTemplate implements MailTemplate{

    @Override
    public String getTemplate() {
        return "Hello partners!!";
    }

}
