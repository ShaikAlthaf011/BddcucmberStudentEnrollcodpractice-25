Feature: Student Enroll Application

  Background:
    Given Navigate to Student Enroll Application

  Scenario: Verify the Student enroll process
    When  Verify the Enroll Button
    Then  Click on the Enroll button and verify the enroll popup
    Then  Close the browser

  Scenario: Verify with the valid username and email
    When   Enter username in the registration page
    Then   Enter email in the registration page
    When  Verify the Enroll Button
    Then  Close the browser

  Scenario: Verify with the invalid username and email
    When   Enter username in the registration page
    Then   Enter email in the registration page
    When  Verify the Enroll Button
    Then  Close the browser
