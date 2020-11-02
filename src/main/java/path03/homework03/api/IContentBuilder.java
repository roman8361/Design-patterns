package path03.homework03.api;


import path03.homework03.builder.LetterBuilder;
import path03.homework03.entiry.Content;

public interface IContentBuilder {

    LetterBuilder addContent(Content content);

}
