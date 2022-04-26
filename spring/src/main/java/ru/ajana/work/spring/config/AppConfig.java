package ru.ajana.work.spring.config;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional({CustomCondition.class})
@Configuration
public class AppConfig {

}
