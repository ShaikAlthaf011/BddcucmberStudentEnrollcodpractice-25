Feature: Student Enroll Application

  Background:
    Given Navigate to Student Enroll Application

  Scenario: Login To Student Enroll Button  Application
    When  Verify the Enroll Button
    Then  Verify the poop Student Enroll
    Then  Close the browser

  Scenario: Login To Student Enroll Valid Application
    When   Verify the Register Name
    Then   Verify The Register Email
    When  Verify the Enroll Button
    Then  Verify the poop Student Enroll
    Then  Close the browser
