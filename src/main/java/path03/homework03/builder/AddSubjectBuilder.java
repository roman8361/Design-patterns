package path03.homework03.builder;


import path03.homework03.api.ISubjectBuilder;
import path03.homework03.api.IToBuilder;
import path03.homework03.entiry.Letter;

public class AddSubjectBuilder implements ISubjectBuilder {

    @Override
    public IToBuilder addSubject(String subject) {
        Letter letter = new Letter();
        letter.setSubject(subject);
        return new ToBuilder(letter);
    }

}
