package low_level_design.stackoverflow.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDTO {
    private Long id;
    private String title;
    private String content;
    private Long userId;
}