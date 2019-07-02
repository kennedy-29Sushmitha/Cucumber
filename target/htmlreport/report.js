$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/sush5.Feature");
formatter.feature({
  "name": "login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigate to home page",
  "keyword": "Given "
});
formatter.match({
  "location": "loggg.navigate_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters us and user enters pd",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "click up signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "loggg.click_up_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify signin",
  "keyword": "And "
});
formatter.match({
  "location": "loggg.verify_signin()"
});
formatter.result({
  "status": "skipped"
});
});