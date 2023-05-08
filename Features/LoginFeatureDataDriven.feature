@regression
Feature: Login Functionality of sausedemo
  I want to use this template for my feature file

  
  Scenario Outline: Login Functionality
    Given User is on Login Page of sausedemo
    When User enters credentials "<username>" and "<password>"
    And user Clicks on login button
    Then User should be logged in succesfully in sausedemo
    And Close the application sausedemo

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
