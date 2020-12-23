
Feature: Test Login functionality
I want to make sure the login functionality is working

 @smokeTest
 Scenario: Verify login functionality using valid crexentials 
  Given I am on the login page 
  And I entered valid username 
  And I entered Valid password 
  When I click the login button
  Then I should see the dashboard


 