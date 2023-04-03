#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: sign up page

  Background: user is launching the DsAlgo portal
    Given DsAlgo Portal link
    When user clicks the get start button
    Then user navigated to signup page

  @positive
  Scenario Outline: Register for new user
    Given user clicks cn Register link
    When user enters the valid "<UserName>" "<Password>" and "<ConfirmPassword>"
    And user clicks on Register button
    Then user navigated to NumpyNinja Home page

    Examples: 
      | UserName        | Password    | ConfirmPassword |
      | srs110@yopmail.com | numpyninja1 | numpyninja1     |
