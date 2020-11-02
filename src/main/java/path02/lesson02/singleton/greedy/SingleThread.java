package path02.lesson02.singleton.greedy;

import java.util.concurrent.locks.LockSupport;

/**
 * ResThread.
 *
 * @author Ilya_Sukhachev
 */
public class SingleThread extends Thread {

    @Override
    public void run() {
        LockSupport.parkNanos(2000 * 1000000);
//        System.out.println(ru.iteco.patterns.singleton.simple.Single.getInstance());
        System.out.println(Single.getInstance());

    }
}
