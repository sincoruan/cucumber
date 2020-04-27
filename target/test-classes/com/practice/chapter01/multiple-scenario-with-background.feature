Feature: multiple scenario without background
  Background: x and y value
  Scenario: Add
    Given add operation background
    When invoke calculator button background
    Then the result is x+y background
  Scenario: Minus
    Given minus operation background
    When invoke calculator button background
    Then the result is x-y background
