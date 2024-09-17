package low_level_design.stackoverflow.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDTO {
    private Long id;
    private String content;
    private Long userId;
    private Long questionId;
}