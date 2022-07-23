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
Feature: Signup button testing
  

  @tag1
  Scenario: Clicking on sign in button on homepage
    Given   User must be on homepage by clickig on URL "https://www.amazon.ca/"
    
    When User can click on signin button 
    Then user must pass valid username and click on continue
    And  user must pass valid password and clcikc on sign in button to login into their account
    And user name must display with hello <username> account list
    And  user can select my accont from list

  