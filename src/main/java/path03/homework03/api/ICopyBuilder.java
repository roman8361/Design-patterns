package path03.homework03.api;


import path03.homework03.builder.ContentBuilder;

import java.util.Set;

public interface ICopyBuilder {

    ContentBuilder copy(String to);

    ContentBuilder copyAll(Set<String> copyAll);

}
