package low_level_design.stackoverflow.Controllers;

import low_level_design.stackoverflow.Models.Comment;
import low_level_design.stackoverflow.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment postComment(@RequestBody Comment comment) {
        return commentService.postComment(comment);
    }

    @GetMapping("/question/{questionId}")
    public List<Comment> getCommentsByQuestionId(@PathVariable Long questionId) {
        return commentService.getCommentsByQuestionId(questionId);
    }

    @GetMapping("/answer/{answerId}")
    public List<Comment> getCommentsByAnswerId(@PathVariable Long answerId) {
        return commentService.getCommentsByAnswerId(answerId);
    }
}