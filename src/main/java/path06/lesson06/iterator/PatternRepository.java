package path06.lesson06.iterator;

import java.util.Iterator;

/**
 * PatternRepository.
 *
 * @author Ilya_Sukhachev
 */
public class PatternRepository implements Iterable<String> {

    private String[] patterns;
    private int index;

    public PatternRepository() {
        patterns = new String[1];
        index = 0;
    }

    public void addPattern(String pattern) {
        if (index == patterns.length) {
            String[] newStorage = new String[patterns.length + 1];
            System.arraycopy(patterns, 0, newStorage, 0, patterns.length);
            patterns = newStorage;
        }
        patterns[index] = pattern;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < patterns.length && patterns[currentIndex] != null;
            }

            @Override
            public String next() {
                return patterns[currentIndex++];
            }

            @Override
            public void remove() {
                patterns[--currentIndex] = null;
                final int newSize;
                if ((newSize = patterns.length - 1) > currentIndex)
                    System.arraycopy(patterns, currentIndex + 1, patterns, currentIndex, newSize - currentIndex);
                patterns[newSize] = null;
            }
        };
    }
}
