package low_level_design.stackoverflow;

import low_level_design.stackoverflow.DTOs.QuestionDTO;
import low_level_design.stackoverflow.DTOs.UserDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StackOverFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(StackOverFlowApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            // Register a new user
            UserDTO newUser = new UserDTO();
            newUser.setUsername("testuser");
            newUser.setEmail("testuser@example.com");
            UserDTO registeredUser = restTemplate.postForObject("http://localhost:8080/users/register", newUser, UserDTO.class);
            System.out.println("Registered User: " + registeredUser);

            // Post a new question
            QuestionDTO newQuestion = new QuestionDTO();
            newQuestion.setTitle("How to write a REST client in Spring Boot?");
            newQuestion.setContent("I need help with writing a REST client in Spring Boot.");
            newQuestion.setUserId(registeredUser.getId());
            QuestionDTO postedQuestion = restTemplate.postForObject("http://localhost:8080/questions", newQuestion, QuestionDTO.class);
            System.out.println("Posted Question: " + postedQuestion);

            // Search for questions
            QuestionDTO[] questions = restTemplate.getForObject("http://localhost:8080/questions/search?title=REST", QuestionDTO[].class);
            System.out.println("Found Questions: ");
            for (QuestionDTO question : questions) {
                System.out.println(question);
            }
        };
    }
}
