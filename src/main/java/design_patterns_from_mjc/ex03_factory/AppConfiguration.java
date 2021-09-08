package design_patterns_from_mjc.ex03_factory;

import java.util.HashMap;
import java.util.Map;

public class AppConfiguration implements Configuration{

    private Map<Class, Class> interfaceToClass = new HashMap<>();

    public AppConfiguration() {
        interfaceToClass.put(GarbageCollector.class, FullGc.class);
        interfaceToClass.put(Speaker.class, LoudSpeaker.class);
    }

    @Override
    public Class getImplementation(Class clazz) {
        return interfaceToClass.get(clazz);
    }

}
