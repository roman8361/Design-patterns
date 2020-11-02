package path03.lesson03.builder.state;

/**
 * FormalLunchBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class FormalLunchBuilder {

    public ILunchSideDishBuilder addEntree(EntreeType entree) {
        return new LunchSideDishBuilder(entree);
    }

    private class LunchSideDishBuilder implements ILunchSideDishBuilder {
        private EntreeType entree;

        public LunchSideDishBuilder(EntreeType entree) {
            this.entree = entree;
        }

        @Override
        public IFinalLunchBuilder addSideDish(SideDishType sideDish) {
            return new FinalLunchBuilder(entree, sideDish);
        }
    }

    private class FinalLunchBuilder implements IFinalLunchBuilder {
        private EntreeType entreeType;
        private SideDishType sideDish;

        public FinalLunchBuilder(EntreeType entreeType, SideDishType sideDish) {
            this.entreeType = entreeType;
            this.sideDish = sideDish;
        }

        @Override
        public String build() {
            return String.format("{entreeType=%s, sideDish=%s}", entreeType, sideDish);
        }
    }

    public interface ILunchSideDishBuilder {
        IFinalLunchBuilder addSideDish(SideDishType sideDish);
    }

    public interface IFinalLunchBuilder {
        String build();
    }

}


