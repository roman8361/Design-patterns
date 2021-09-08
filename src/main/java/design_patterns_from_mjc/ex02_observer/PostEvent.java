package design_patterns_from_mjc.ex02_observer;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class PostEvent {

    private Date createDate;
    private Post post;

}
