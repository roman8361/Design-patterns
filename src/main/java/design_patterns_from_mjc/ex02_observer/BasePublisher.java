package design_patterns_from_mjc.ex02_observer;

public class BasePublisher implements Publisher{

    @Override
    public void publish(Post post) {
        System.out.println("Publisher... " + post.getContent() );
    }

}
