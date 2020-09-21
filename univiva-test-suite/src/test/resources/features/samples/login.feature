Feature: Login success
  As a User
  I enter correct details on the login
  The issue compilation screen is displayed


  Background:
    Given Joan has opened univiva web application

  @loginSuccess
  Scenario: To verify if user is able to login to univiva web application
    When she enters valid credentials
    Then user homepage is displayed