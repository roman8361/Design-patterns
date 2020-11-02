package path02.lesson02.singleton.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new SingleThread();
            threads.add(thread);
//            thread.start();
        }

        threads.parallelStream().forEach( thread -> thread.start());

    }
}
