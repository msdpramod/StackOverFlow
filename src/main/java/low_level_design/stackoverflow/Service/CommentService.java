package low_level_design.stackoverflow.Service;

import low_level_design.stackoverflow.Models.Comment;
import low_level_design.stackoverflow.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment postComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByQuestionId(Long questionId) {
        return commentRepository.findAll().stream()
                .filter(comment -> comment.getQuestion() != null && comment.getQuestion().getId().equals(questionId))
                .toList();
    }

    public List<Comment> getCommentsByAnswerId(Long answerId) {
        return commentRepository.findAll().stream()
                .filter(comment -> comment.getAnswer() != null && comment.getAnswer().getId().equals(answerId))
                .toList();
    }
}