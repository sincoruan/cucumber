Feature: test multiple conditions&action
  simple test
  without add and but keywords
  Scenario: simple scenario
  multiple pre-conditions
  multiple user action
  multiple expected output
    Given ruanxk open the url of git
    And ruanxk open the url of jenkins
    When ruanxk click build job button
    Then ruanxk the job will be started
    When ruanxk click the job id link
    And ruanxk choice the job console
    And ruanxk click into the console page
    Then ruanxk the job building log will be print
    And ruanxk the last job can see successfully state
    But ruanxk the job will not running at current
