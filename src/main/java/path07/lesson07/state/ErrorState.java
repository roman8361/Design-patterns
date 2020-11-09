package path07.lesson07.state;

/**
 * ErrorState.
 *
 * @author Ilya_Sukhachev
 */
public class ErrorState extends StateBase {
    @Override
    public void close(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }

    @Override
    public void connect(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }
}
