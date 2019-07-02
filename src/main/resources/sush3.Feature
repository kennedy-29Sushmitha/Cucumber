Feature: signup


Scenario Outline: test signup function with different set of input

Given user opens signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters d as "<dob>"
And user enters pwd as "<password>"
And user enters cpwd as "<confirmpassword>"
Then click signup button
And verify signup success message

Examples:
|firstname|lastname|dob|password|confirmpassword|
|sushmi|kennedy|23-03-1998|asd123#|asd123#2|
|sushmi|kennedy|23-03-1998|asd123#|asd123#2|