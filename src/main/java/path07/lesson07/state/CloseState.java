package path07.lesson07.state;

/**
 * CloseState.
 *
 * @author Ilya_Sukhachev
 */
public class CloseState extends StateBase {

    @Override
    public void connect(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }

    @Override
    public void close(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }
}
