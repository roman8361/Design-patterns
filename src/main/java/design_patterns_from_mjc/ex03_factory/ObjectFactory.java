package design_patterns_from_mjc.ex03_factory;

import java.lang.reflect.InvocationTargetException;

public enum ObjectFactory {
    INSTANCE;

    private Configuration configuration = new AppConfiguration();

    public <T> T createClass(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class implementation = null;
        if (clazz.isInterface()) {
            implementation = configuration.getImplementation(clazz);
        }
        return (T) implementation.getDeclaredConstructor().newInstance();
    }
}
