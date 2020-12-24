$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/login.feature");
formatter.feature({
  "line": 2,
  "name": "Test Login functionality",
  "description": "I want to make sure the login functionality is working",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Verify login functionality using valid crexentials",
  "description": "",
  "id": "test-login-functionality;verify-login-functionality-using-valid-crexentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I entered valid username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I entered Valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should see the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 4034294789,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_entered_valid_username()"
});
formatter.result({
  "duration": 240919239,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_entered_Valid_password()"
});
formatter.result({
  "duration": 59325726,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_the_login_button()"
});
formatter.result({
  "duration": 894042906,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_should_see_the_dashboard()"
});
formatter.result({
  "duration": 646818,
  "status": "passed"
});
});