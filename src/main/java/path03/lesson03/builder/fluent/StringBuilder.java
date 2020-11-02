package path03.lesson03.builder.fluent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * OptimizedStringBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class StringBuilder
//        implements IStringBuilder
{
    private Queue<Character> text;

    public StringBuilder() {
        text = new LinkedList<>();
    }

    public StringBuilder append(String text) {
        for (char c : text.toCharArray()) {
            this.text.add(Character.valueOf(c));
        }

        return this;
    }

    public StringBuilder appendLine(String text) {
        append(text);
        this.text.add('\n');
        return this;
    }

    public StringBuilder appendFormat(String template, Object... args) {
        var text = String.format(template, args);
        return append(text);
    }

    public String getResult() {
        return text.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
