package com.play.serenity.test.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class TestProperties {

  @Value("${webapp.url}")
  private String webAppUrl;

  @Value("${email}")
  private String email;

  @Value("${password}")
  private String password;

}
