Feature: Login into application

Scenario Outline: positive test validation login
Given initialize the browser with chrome 
And navigate to the "qaclickacademy.com"
And click on login button to land on login page
When user enter <username> and <password> and logs in
Then verify user is loged in

Examples:
|username |password|
|test99@gmail.com |123456 |