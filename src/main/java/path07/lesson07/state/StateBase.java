package path07.lesson07.state;

/**
 * StateBase.
 *
 * @author Ilya_Sukhachev
 */
public abstract class StateBase implements State {

    @Override
    public void close(ConnectionContext context) {
        context.state = new CloseState();
    }

    @Override
    public abstract void connect(ConnectionContext context);

    @Override
    public abstract byte[] read(ConnectionContext context);

}
