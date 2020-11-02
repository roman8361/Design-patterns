package path04.lesson04.proxy.anotherExample;

import java.io.IOException;
import java.nio.file.Path;

public interface Parser {

    @WithReturnValue
    String read() throws IOException;

    @WithArgs
    boolean copy(Path path) throws IOException;
}
