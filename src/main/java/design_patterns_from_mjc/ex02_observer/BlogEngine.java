package design_patterns_from_mjc.ex02_observer;

import java.util.ArrayList;
import java.util.List;

public class BlogEngine {

    private Publisher publisher = new BasePublisher();

    private List<Subscriber> subscriberList = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void addPost(Post post) {
        PostEvent postEvent = PostEvent.builder()
                .post(post)
                .build();
        publisher.publish(post);
        subscriberList.forEach(subscriber -> subscriber.notify(postEvent));
    }

}
