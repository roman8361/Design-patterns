package path06.lesson06.iterator;

import java.util.Iterator;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {
    public static void main(String[] args) {
        PatternRepository patternRepository = new PatternRepository();
        patternRepository.addPattern("iterator");
        patternRepository.addPattern("templatemethod");
        patternRepository.addPattern("observer");

        Iterator<String> patternIterator = patternRepository.iterator();
        while (patternIterator.hasNext()) {
            String next = patternIterator.next();
            System.out.println(next);
            if (next.equals("iterator"))
                patternIterator.remove();
        }

        patternIterator = patternRepository.iterator();
        System.out.println("**************");
        while (patternIterator.hasNext()) {
            System.out.println(patternIterator.next());
        }
    }
}
