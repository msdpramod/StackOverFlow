package low_level_design.stackoverflow.ObjectMapper;

import low_level_design.stackoverflow.DTOs.QuestionDTO;
import low_level_design.stackoverflow.Models.Question;

public class QuestionMapper {
    public static QuestionDTO toDTO(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setTitle(question.getTitle());
        dto.setContent(question.getContent());
        dto.setUserId(question.getUser().getId());
        return dto;
    }

    public static Question toEntity(QuestionDTO dto) {
        Question question = new Question();
        question.setId(dto.getId());
        question.setTitle(dto.getTitle());
        question.setContent(dto.getContent());
        return question;
    }
}