package low_level_design.stackoverflow.Service;

import low_level_design.stackoverflow.Models.Answer;
import low_level_design.stackoverflow.Repositories.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public Answer postAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<Answer> getAnswersByQuestionId(Long questionId) {
        return answerRepository.findAll().stream()
                .filter(answer -> answer.getQuestion().getId().equals(questionId))
                .toList();
    }
}