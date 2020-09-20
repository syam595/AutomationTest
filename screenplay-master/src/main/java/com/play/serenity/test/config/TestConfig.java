package com.play.serenity.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.TestPropertySource;

@Configuration
@PropertySource("classpath:application-${environment}.properties")
@TestPropertySource("classpath:bootstrap-${environment}.properties")
@ComponentScan(basePackages = {"com.play.serenity.test"})
public class TestConfig {

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfig() {
    return new PropertySourcesPlaceholderConfigurer();
  }

}
