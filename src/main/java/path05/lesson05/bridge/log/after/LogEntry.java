package path05.lesson05.bridge.log.after;

import java.time.LocalDateTime;

/**
 * LogEntry.
 *
 * @author Ilya_Sukhachev
 */
public class LogEntry {

    private LocalDateTime date;
    private String message;

    public LogEntry(LocalDateTime date, String message) {
        this.date = date;
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
