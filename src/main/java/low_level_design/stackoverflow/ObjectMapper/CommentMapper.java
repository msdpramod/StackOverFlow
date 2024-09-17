package low_level_design.stackoverflow.ObjectMapper;

import low_level_design.stackoverflow.DTOs.CommentDTO;
import low_level_design.stackoverflow.Models.Comment;

public class CommentMapper {
    public static CommentDTO toDTO(Comment comment) {
        CommentDTO dto = new CommentDTO();
        dto.setId(comment.getId());
        dto.setContent(comment.getContent());
        dto.setUserId(comment.getUser().getId());
        if (comment.getQuestion() != null) {
            dto.setQuestionId(comment.getQuestion().getId());
        }
        if (comment.getAnswer() != null) {
            dto.setAnswerId(comment.getAnswer().getId());
        }
        return dto;
    }

    public static Comment toEntity(CommentDTO dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setContent(dto.getContent());
        return comment;
    }
}