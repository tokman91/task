package home.interview.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"home.interview.task"})
public class CustomerRewards {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRewards.class, args);
    }
}