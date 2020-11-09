package path07.lesson07.state;

/**
 * ReadState.
 *
 * @author Ilya_Sukhachev
 */
public class ReadState extends StateBase {

    @Override
    public void connect(ConnectionContext context) {
    }

    @Override
    public byte[] read(ConnectionContext context) {
        return new byte[0];
    }

}
