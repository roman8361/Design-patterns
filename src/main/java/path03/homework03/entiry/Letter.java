package path03.homework03.entiry;

import lombok.Setter;

import java.util.Set;

@Setter
public class Letter {

    private String subject;

    private String to;

    private Set<String> toAll;

    private String copyTo;

    private Set<String> copyToAll;

    private Content content;

    @Override
    public String toString() {
        return "Letter{" +
                "subject='" + subject + '\'' +
                ", to='" + to + '\'' +
                ", toAll=" + toAll +
                ", copyTo='" + copyTo + '\'' +
                ", copyToAll=" + copyToAll +
                ", content=" + content +
                '}';
    }

}
