package low_level_design.stackoverflow.Controllers;

import low_level_design.stackoverflow.Models.Answer;
import low_level_design.stackoverflow.Service.AnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @PostMapping
    public Answer postAnswer(@RequestBody Answer answer) {
        return answerService.postAnswer(answer);
    }

    @GetMapping("/question/{questionId}")
    public List<Answer> getAnswersByQuestionId(@PathVariable Long questionId) {
        return answerService.getAnswersByQuestionId(questionId);
    }
}