Feature: Login and Logout

  Background:
    Given open Website
    Then Verify user in Login Page
    When Enter username "Admin" ans password "admin123"

  Scenario: Login and Logout
    When User Click Logout
    Then Verify user in Login Page

  Scenario:Verify user can create new user
    And click on Admin page
    And Click on Add button
    Then Select user Role - ESS
    And Employee name - James  Butler
    And Status Enable
    When Generate username randomly
    And Generate password randomly
    And Click on Save Button
    Then Verify success message is displayed
    When Search with newly created user
    And Verify newly created user displayed in search list
    And Click on delete icon of the newly created user
    And Verify Successfully Deleted is displayed

  Scenario:  Verify user can create new Candidate
    When Click on Recruitment link
    And Click on Add button
    And Fill required details with upload on doc file in resume
    And Click on Save Button
    And Verify success message is displayed
    Then Search candidate with name
    And Verify search result displays candidate name



