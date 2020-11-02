package path04.lesson04.proxy.simple;


public class TrainerImpl implements Trainer {

    public TrainerImpl() {
        System.out.println("create TrainerImpl");
    }

    @Override
    public void process() {
        System.out.println("processing complete.");
    }
}
