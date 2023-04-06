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
@tag
Feature: DataStructure module

  Scenario: User navigates to DataStructure module
    Given User is on  data structure module
    When User clicks data structure get start button
    Then User launches data structure page

  @Positive @Negative
  Scenario: user is trying to access TimeComplexity
    Given user enters onto TimeComplexity link
    When user clicks on TimeComplexity
    And user launches on TimeComplexity page

  @Positive
  Scenario: user is trying to click TryHere button
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code
