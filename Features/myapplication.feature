Feature: Test Sort smoke Scenario

Scenario: Test Login wuith valid credentials
 Given Open firefox and start application
 When I enter valid "vijayakumar@wrender.co.uk" and valid "Martin$1234"
 Then user should be able to login Successfully
