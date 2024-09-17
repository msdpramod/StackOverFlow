package low_level_design.stackoverflow.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoteDTO {
    private Long id;
    private boolean upvote;
    private Long userId;
    private Long questionId;
    private Long answerId;
}