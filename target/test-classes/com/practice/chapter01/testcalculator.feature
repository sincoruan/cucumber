Feature: Basic Add

  Scenario: Addtion
    Given x is 4 and y is 5
    When I invoke add method
    Then the result is 9
