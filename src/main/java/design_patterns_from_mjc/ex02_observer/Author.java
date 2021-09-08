package design_patterns_from_mjc.ex02_observer;

import lombok.Data;

@Data
public class Author {

    public Author(String name) {
        this.name = name;
    }

    private String name;
}
