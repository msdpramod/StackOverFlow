package low_level_design.stackoverflow.Controllers;

import low_level_design.stackoverflow.Models.Question;
import low_level_design.stackoverflow.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question postQuestion(@RequestBody Question question) {
        return questionService.postQuestion(question);
    }

    @GetMapping("/search")
    public List<Question> searchQuestions(@RequestParam String title) {
        return questionService.searchQuestions(title);
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }
}