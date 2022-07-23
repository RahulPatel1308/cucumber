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
Feature: Sorting Functionality testing
  

  @tag1
  Scenario: Testing different sorting feature
    Given   User be on homepage url "https://www.amazon.ca/"
    And     User click on sign in button
    And     User pass valid username and password to Sign in
    When    User in their account type iphone in search bar click on search
    And     Click on sorting feature
    Then    User can select sort product as per their requirment and select price low to high 
  