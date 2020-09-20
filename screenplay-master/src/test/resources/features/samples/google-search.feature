Feature: Keyword search in google

  Background:
    Given Joan has opened google page

  @google
  Scenario: To verify if user is able to opena nd search in Google
    When she search for a keyword ""
    Then results are displayed