package com.join.demo.Configuration;


import com.join.demo.service.StudentService;
import com.join.demo.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.join.demo.repository")
public class JpaConfig {


    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl();
    }
}