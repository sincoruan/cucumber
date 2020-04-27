Feature: multiple scenario without background
  Scenario: Add
    Given x and y value
    And add operation
    When invoke calculator button
    Then the result is x+y
  Scenario: Minus
    Given x and y value
    And minus operation
    When invoke calculator button
    Then the result is x-y
