Feature: login functionality

Scenario: login with credentials

When user searches for products
|iphone|
|travel kit|
|headphone|
And verify products displayed
Then close application