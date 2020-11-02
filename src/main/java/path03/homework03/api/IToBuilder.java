package path03.homework03.api;


import path03.homework03.builder.CopyBuilder;

import java.util.Set;

public interface IToBuilder {

    CopyBuilder to(String to);

    CopyBuilder toAll(Set<String> toAll);

}
