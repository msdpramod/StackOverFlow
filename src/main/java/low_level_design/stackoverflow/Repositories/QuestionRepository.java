package low_level_design.stackoverflow.Repositories;

import low_level_design.stackoverflow.Models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByTitleContaining(String title);
}