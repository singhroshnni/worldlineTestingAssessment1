
Feature: Login credential Check on login page 
  
  Scenario: Login with Valid Credentials
    Given Broswer is open 
    And Web-App is open and is on login page
    When Enter valid email and password
    And click on submit
    Then My account page is displayed

  Scenario Outline: Login with Invalid Credentials
    Given Broswer is open 
    And Web-App is open and is on login page
    When Enter invalid "<email>" and "<password>" combinations
    And click on submit
    Then an error is displayed

    Examples: 
      | email                         | password  |
      | singhroshni7456@gmail.com     | qwerty456 |
      | wrongemail                    | asdfg456  |
      | wrongemail2                   | kisnlcm   |
