package design_patterns_from_mjc.ex02_observer;

public class BaseSubscriber implements  Subscriber{

    @Override
    public void notify(PostEvent postEvent) {
        System.out.println("Notifying... " + postEvent.getPost().getContent());
    }

}
