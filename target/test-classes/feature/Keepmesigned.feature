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
Feature: Keep me Sign In checkbox
  
  @tag1
  
  Scenario: Checking functionality of keep me signed in
    Given  user must be on homepage url "https://www.amazon.ca/"
    And  User Must click on signin button 
    
    When User must pass valid username password
    Then select Keep me signed in checkbox 
    

  