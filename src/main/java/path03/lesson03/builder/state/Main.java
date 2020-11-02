package path03.lesson03.builder.state;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
//        runStateBuilder();
        runFormalStateBuilder();
    }

    private static void runStateBuilder() {
        var lunch = new LunchBuilder()
                .addEntree(EntreeType.CUTLET)
                .addSideDish(SideDishType.PUREE)
                .build();

        System.out.println(lunch);

        var lunch2 = new LunchBuilder
                .LunchSideDishBuilder(EntreeType.CUTLET)
                .addSideDish(SideDishType.PASTA)
                .build();

        System.out.println(lunch2);

    }

    private static void runFormalStateBuilder() {
        var lunch = new FormalLunchBuilder()
                .addEntree(EntreeType.STEAK)
                .addSideDish(SideDishType.PASTA)
                .build();

        System.out.println(lunch);
    }

}
