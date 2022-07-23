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
Feature: Tseting Product Information Feature
  

  @tag1
  Scenario: Testing products features 
    Given User be on homepage of url "https://www.amazon.ca/"
    And   user click on sign in
    And   user pass valid username and password to log in
    When  User in their account pass iphone and click on search button
    Then  Select first product from the page 
    And   Selected product must show price
    And   Selected product must show customer review and ratings
    
