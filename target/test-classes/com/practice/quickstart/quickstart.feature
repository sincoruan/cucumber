Feature: Test Git web Application

  Scenario: Web Site loads
  application page load should be quick

    Given application URL is ready with the user
    When user enters the URL in browser
    Then application page loads
