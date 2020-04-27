Feature: Complex Data type
  Scenario: multiple then keyword
    Given the user account information
    Then we can found user "Alex" with password "123456" ,phone "345345" exists
    Then we can found user "Alex" with password "123456" ,phone "345345" exists
    Then we can found user "Alex" with password "123456" ,phone "345345" exists
  Scenario: use complex data type
    Given the user account infomation
    Then we verify following user exsits
    |name | email | phone|
    |Alex | 123456 | 345345|
