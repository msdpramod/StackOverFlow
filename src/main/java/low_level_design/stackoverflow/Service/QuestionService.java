package low_level_design.stackoverflow.Service;

import low_level_design.stackoverflow.Models.Question;
import low_level_design.stackoverflow.Repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question postQuestion(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> searchQuestions(String title) {
        return questionRepository.findByTitleContaining(title);
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }
}