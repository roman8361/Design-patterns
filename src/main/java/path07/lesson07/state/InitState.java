package path07.lesson07.state;

/**
 * InitState.
 *
 * @author Ilya_Sukhachev
 */
public class InitState extends StateBase {

    @Override
    public void connect(ConnectionContext context) {
        System.out.println("Connecting to " + context.url);
        context.state = new ReadState();
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Connection is not opened");
    }

}
