package com.play.serenity.test.config;

public enum Environment {

  DEV("dev"),
  SIT("sit"),
  UAT("uat"),
  PROD("prod"),
  LOCAL("local"),
  LOCAL_WEBAPP("local-webapp");

  private String testEnvironment;

  Environment(String testEnvironment) {
    this.testEnvironment = testEnvironment;
  }

  public String getValue() {
    return testEnvironment;
  }

}
