package path03.homework03;

import hw03.builder.AddSubjectBuilder;
import hw03.entiry.Content;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        oneSendTo();
        manySendTo();
    }

    private static void oneSendTo() {
        var content = new Content.Builder()
                .body("Iha")
                .signature("ivano")
                .build();

        var letter = new AddSubjectBuilder()
                .addSubject("")
                .to("lolo@lolo.ru")
                .copy("rr@rr.ru")
                .addContent(content)
                .build();

        System.out.println(letter);
    }

    private static void manySendTo() {
        var content = new Content.Builder()
                .body("Iha")
                .signature("ivano")
                .build();

        var letter = new AddSubjectBuilder()
                .addSubject("Hello anybody")
                .toAll(Set.of("aa@aa.com", "bb@bb.com", "cc@cc.com"))
                .copyAll(Set.of("tt@tt.com", "nn@nn.com", "zz@zz.com"))
                .addContent(content)
                .build();

        System.out.println(letter);
    }

}
