package xiaohutu.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@ComponentScan("xiaohutu.springel")
@Configuration
@PropertySource("test.properties")
public class ResourceConfig {
    @Value("${book.author}")
    private String bookAuthor;

    @Bean
    public PropertySourcesPlaceholderConfigurer getBean(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
