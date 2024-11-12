Feature: Testing Simple Form Submission

  Scenario: Fill out the simple form and submit
    Given I am on the simple form page
    When I enter the name "John Doe" and email "johndoe@example.com"
    And I enter the message "This is a test message."
    And I click on the submit button
    Then I should see a confirmation message