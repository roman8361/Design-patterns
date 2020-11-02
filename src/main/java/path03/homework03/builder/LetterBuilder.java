package path03.homework03.builder;


import path03.homework03.api.ILetterBuilder;
import path03.homework03.entiry.AbstractLetter;
import path03.homework03.entiry.Letter;

public class LetterBuilder extends AbstractLetter implements ILetterBuilder {

    public LetterBuilder(Letter letter) {
        super(letter);
    }

    @Override
    public String build() {
        return letter.toString();
    }

}
