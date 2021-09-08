package design_patterns_from_mjc.ex02_observer;

public class App {

    public static void main(String[] args) {
        Post post = new Post(new Author("Ivano"), "blablabal");
        BlogEngine blogEngine = new BlogEngine();
        blogEngine.addSubscriber(new BaseSubscriber());
        blogEngine.addPost(post);
    }

}
