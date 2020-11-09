package path07.lesson07.state;

/**
 * ConnectionContext.
 *
 * @author Ilya_Sukhachev
 */
public class ConnectionContext {

    public String url;
    public State state;

    public ConnectionContext(String url) {
        this.url = url;
        this.state = new InitState();
    }

    public void connect() {
        state.connect(this);
    }

    public byte[] read() {
        return state.read(this);
    }

    public void close() {
        state.close(this);
    }

}
