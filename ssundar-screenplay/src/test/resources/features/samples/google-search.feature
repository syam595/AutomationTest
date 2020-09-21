Feature: Keyword search in google

  Background:
    Given Joan has opened google page

  @univiva
  Scenario: To verify if user is able to open and search in Google
    When she search for a keyword ""
    Then results are displayed