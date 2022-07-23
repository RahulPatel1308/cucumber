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
Feature: Search fecility Testing

  @tag1
  Scenario: Checking functionality of search bar
    Given User should be on homepage url "https://www.amazon.ca/"
    And User should click on sign in button
    And User should pass valid username password and log in to their account
    When User in their account search for tshirt in search bar ,user should get tshirt for men ,women and all related suggestion
    Then User select tshirt for men and click on search bar
