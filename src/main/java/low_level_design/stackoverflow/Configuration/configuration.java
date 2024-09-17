package low_level_design.stackoverflow.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class configuration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
