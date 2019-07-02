Feature: Test Login

Scenario: Login with valid
Given open newtours app
When user enter un as "mercury" And psd as "mercury"
And click Submit login form
Then verify pass


Scenario: Login with invalid
Given open newtours app
When user enter un as "mercury" And psd as "mercury"
And click Submit login form
Then verify pass
