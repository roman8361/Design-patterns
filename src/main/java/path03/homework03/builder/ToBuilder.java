package path03.homework03.builder;


import path03.homework03.api.IToBuilder;
import path03.homework03.entiry.AbstractLetter;
import path03.homework03.entiry.Letter;

import java.util.Set;

public class ToBuilder extends AbstractLetter implements IToBuilder {

    public ToBuilder(Letter letter) {
        super(letter);
    }

    @Override
    public CopyBuilder to(String to) {
        letter.setTo(to);
        return new CopyBuilder(letter);
    }

    @Override
    public CopyBuilder toAll(Set<String> toAll) {
        letter.setToAll(toAll);
        return new CopyBuilder(letter);
    }

}
