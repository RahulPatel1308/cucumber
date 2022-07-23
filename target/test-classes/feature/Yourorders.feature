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
Feature: Your order module testing

  @tag1
  Scenario: Checking functionality of Your order module
    Given User must be on homepage url "https://www.amazon.ca/"
    And User must click on sign in button
    And User must pass valid username password and log in to their account
    When User in to their account select your orders from the list
    Then User can see their order history
    And  User can see option like buy again ,not yet shipped and cancelled order
