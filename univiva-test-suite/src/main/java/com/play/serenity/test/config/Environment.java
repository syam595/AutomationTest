package com.play.serenity.test.config;

public enum Environment {

  DEV("dev"),
  E2E("e2e"),
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
