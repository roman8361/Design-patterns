package path03.homework03.builder;


import path03.homework03.api.IContentBuilder;
import path03.homework03.entiry.AbstractLetter;
import path03.homework03.entiry.Content;
import path03.homework03.entiry.Letter;

public class ContentBuilder extends AbstractLetter implements IContentBuilder {

    public ContentBuilder(Letter letter) {
        super(letter);
    }

    @Override
    public LetterBuilder addContent(Content content) {
        letter.setContent(content);
        return new LetterBuilder(letter);
    }

}
