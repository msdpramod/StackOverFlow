package low_level_design.stackoverflow.ObjectMapper;

import low_level_design.stackoverflow.DTOs.AnswerDTO;
import low_level_design.stackoverflow.Models.Answer;

public class AnswerMapper {
    public static AnswerDTO toDTO(Answer answer) {
        AnswerDTO dto = new AnswerDTO();
        dto.setId(answer.getId());
        dto.setContent(answer.getContent());
        dto.setUserId(answer.getUser().getId());
        dto.setQuestionId(answer.getQuestion().getId());
        return dto;
    }

    public static Answer toEntity(AnswerDTO dto) {
        Answer answer = new Answer();
        answer.setId(dto.getId());
        answer.setContent(dto.getContent());
        return answer;
    }
}