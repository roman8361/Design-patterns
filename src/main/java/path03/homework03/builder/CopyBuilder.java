package path03.homework03.builder;


import path03.homework03.api.ICopyBuilder;
import path03.homework03.entiry.AbstractLetter;
import path03.homework03.entiry.Letter;

import java.util.Set;

public class CopyBuilder extends AbstractLetter implements ICopyBuilder {

    public CopyBuilder(Letter letter) {
        super(letter);
    }

    @Override
    public ContentBuilder copy(String to) {
        letter.setCopyTo(to);
        return new ContentBuilder(letter);
    }

    @Override
    public ContentBuilder copyAll(Set<String> copyAll) {
        letter.setCopyToAll(copyAll);
        return new ContentBuilder(letter);
    }

}
