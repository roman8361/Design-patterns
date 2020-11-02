package path06.lesson06.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String> patterns = new ArrayList<>();
        patterns.add("iterator");
        patterns.add("templatemethod");
        patterns.add("observer");

        Iterator<String> iterator = patterns.iterator();

        while (iterator.hasNext()) {
            String pattern = iterator.next();
            System.out.println(pattern);
            if (pattern.equals("iterator"))
                iterator.remove();
        }

        System.out.println("Names size: " + patterns.size());

        iterator = patterns.iterator();
        while (iterator.hasNext()) {
            String pattern = iterator.next();
            System.out.println(pattern);
        }
    }
}
