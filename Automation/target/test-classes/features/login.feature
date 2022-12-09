Feature: Application Login
Scenario: Home page default login

Given User is on Netbanking landing page
When User login into application with "user1" and password "1243"
Then Home page is displayed


Scenario: Home page default login

Given User is on Netbanking landing page
When User login into application with "user2" and password "124443"
Then Home page is displayed