package cn.edu.njtech.Condition;

import cn.edu.njtech.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MyConfig {
    @Bean
    @MyConditionalOnProperty(value = "env", havingValue = "dev")
    public Person person() {
        log.info("创建Bean");
        return new Person();
    }
}
