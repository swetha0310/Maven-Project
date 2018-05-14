$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "http://demo.automationtesting.in/WebTable.html",
  "description": "",
  "id": "http://demo.automationtesting.in/webtable.html",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Testing Frames",
  "description": "",
  "id": "http://demo.automationtesting.in/webtable.html;testing-frames",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "demo automationtesting is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on skip sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Automation Demo Site title is appeared",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Switch to tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select Frames from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "enter text in text-box",
  "keyword": "And "
});
formatter.match({
  "location": "NewTest.demo_automationtesting_is_launched()"
});
formatter.result({
  "duration": 163031946,
  "error_message": "java.lang.NullPointerException\r\n\tat maven.frmwork.NewTest.demo_automationtesting_is_launched(NewTest.java:28)\r\n\tat ✽.Given demo automationtesting is launched(sample.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NewTest.click_on_skip_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.automation_Demo_Site_title_is_appeared()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.click_on_Switch_to_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.select_Frames_from_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NewTest.enter_text_in_text_box()"
});
formatter.result({
  "status": "skipped"
});
});