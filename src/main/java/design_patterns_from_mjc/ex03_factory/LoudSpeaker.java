package design_patterns_from_mjc.ex03_factory;

public class LoudSpeaker implements Speaker{

    @Override
    public void speak(String input) {
        System.out.println(input);
    }

}
