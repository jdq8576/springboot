package cn.edu.njtech;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context = SpringApplication.run(Application.class);

        System.out.println(context.getEnvironment().getProperty("name"));

        System.out.println(context.containsBean("person"));
    }

}
