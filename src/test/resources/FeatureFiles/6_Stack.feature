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
@tag
Feature: Stack module

  Scenario: User navigates to Stack module
    Given User is on stack module
    When User clicks on stack module's get start button
    Then User launches on stack page

  Scenario: User navigates to operations in stack
    Given User is on operations in stack
    When User clicks on operations in stack button
    Then User launches on operations in stack page
    
  Scenario: User Clicks TryHere
    Given user clicks on TryHere button
    And user navigated to Tryeditor page to write a Python code
    When user is writing Python code
    And user clicks on Run button
    Then user can see the Output of Python code 
 
