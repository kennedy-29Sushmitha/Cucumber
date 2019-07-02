Feature: Test background keyword
Background: display welcome
Given application displays welcome msg

@smoke
Scenario: sign in
Given users un and psd
And click signin

@regression
Scenario: search for the product
When user searches for honor

@regression
Scenario: add to cart
When user adding the searched product to cart

@regression
Scenario: payment process
When user performing payment process using netbanking

@smoke @regression
Scenario: signout
When user performing logout from online shopping cart