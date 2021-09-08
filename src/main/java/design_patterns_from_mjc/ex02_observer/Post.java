package design_patterns_from_mjc.ex02_observer;

import lombok.Data;

@Data
public class Post {

    private Author author;

    private String content;

    public Post(Author author, String content) {
        this.author = author;
        this.content = content;
    }

}
