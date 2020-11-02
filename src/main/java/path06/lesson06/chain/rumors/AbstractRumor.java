package path06.lesson06.chain.rumors;

/**
 * AbstractRumor.
 *
 * @author Ilya_Sukhachev
 */
public abstract class AbstractRumor implements Rumors {

    protected AbstractRumor rumor;

    public AbstractRumor(AbstractRumor rumor) {
        this.rumor = rumor;
    }

    @Override
    public void sayRumor(String rumor) {
        if (this.rumor != null) {
            this.rumor.sayRumor(rumor);
        }
    }
}
