package path04.lesson04.proxy.simple;


public class TrainerProxy implements Trainer {

    private static Trainer trainer;

    @Override
    public void process() {
        if(trainer == null) {
            trainer = new TrainerImpl();
        }
        extraMethod();
        trainer.process();
        extraMethod();
        System.out.println("proxy complete.");
    }

    private void extraMethod() {
        System.out.println("extraMethod");
    }
}
