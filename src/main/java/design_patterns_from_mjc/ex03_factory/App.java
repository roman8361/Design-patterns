package design_patterns_from_mjc.ex03_factory;

import lombok.SneakyThrows;

public class App {

    @SneakyThrows
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.clean();
    }

}
