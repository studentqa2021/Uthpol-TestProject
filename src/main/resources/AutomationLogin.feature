@SmokeTest 

Feature: Login function test with valid credential, positive scenario
Description:  valid user can login successfully by using valid credential

@TC_001
Scenario: valid user able to login the application with valid credintial
Given open a browser
And go to app url

When enter valid username
And enter valid passward
And click login buttion
Then verify the login
    
