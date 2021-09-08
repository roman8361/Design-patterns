package design_patterns_from_mjc.ex03_factory;

import java.lang.reflect.InvocationTargetException;

public class Robot {

    private Speaker speaker;

    private GarbageCollector garbageCollector;

    public Robot() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        speaker = ObjectFactory.INSTANCE.createClass(Speaker.class);
        garbageCollector = ObjectFactory.INSTANCE.createClass(GarbageCollector.class);
    }

    public void clean() {
        speaker.speak("START!!!");
        garbageCollector.clean();
        speaker.speak("WORK IS OVER!!!");
    }

}
