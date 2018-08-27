$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F3779 - Establish Operational Audit Functionality.feature");
formatter.feature({
  "line": 2,
  "name": "F3779 - Establish Operational Audit Functionality",
  "description": "",
  "id": "f3779---establish-operational-audit-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "US10491 - Admin Screen - Validating records on Grid (TC7460)",
  "description": "",
  "id": "f3779---establish-operational-audit-functionality;us10491---admin-screen---validating-records-on-grid-(tc7460)",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "an IU user have role of Admin Ops",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User logs with \"\u003cUser ID\u003e\" as CPT ICD RA into JBPM Application",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "They should able to click on CPT ICD Link-Admin link under Adminstration tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Screen will be opened in a new tab with title CPTICD Links- Admin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "RA captures Admin screen data count by executing a Query",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The records count in the Admin screen grid should match with the DB count",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Logout Application",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "f3779---establish-operational-audit-functionality;us10491---admin-screen---validating-records-on-grid-(tc7460);",
  "rows": [
    {
      "cells": [
        "User ID"
      ],
      "line": 15,
      "id": "f3779---establish-operational-audit-functionality;us10491---admin-screen---validating-records-on-grid-(tc7460);;1"
    },
    {
      "cells": [
        "iht_ittest05"
      ],
      "line": 16,
      "id": "f3779---establish-operational-audit-functionality;us10491---admin-screen---validating-records-on-grid-(tc7460);;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "US10491 - Admin Screen - Validating records on Grid (TC7460)",
  "description": "",
  "id": "f3779---establish-operational-audit-functionality;us10491---admin-screen---validating-records-on-grid-(tc7460);;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "an IU user have role of Admin Ops",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User logs with \"iht_ittest05\" as CPT ICD RA into JBPM Application",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "They should able to click on CPT ICD Link-Admin link under Adminstration tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Screen will be opened in a new tab with title CPTICD Links- Admin",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "RA captures Admin screen data count by executing a Query",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The records count in the Admin screen grid should match with the DB count",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Logout Application",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase1.an_IU_user_have_role_of_Admin_Ops()"
});
formatter.result({
  "duration": 8339914431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iht_ittest05",
      "offset": 16
    }
  ],
  "location": "TestCase1.user_logs_with_as_CPT_ICD_RA_into_JBPM_Application(String)"
});
formatter.result({
  "duration": 3176413762,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1.they_should_able_to_click_on_CPT_ICD_Link_Admin_link_under_Adminstration_tab()"
});
formatter.result({
  "duration": 1437807948,
  "status": "passed"
});
formatter.match({
  "location": "TestCase1.screen_will_be_opened_in_a_new_tab_with_title_CPTICD_Links_Admin()"
});
formatter.result({
  "duration": 10049636895,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(), \u0027CPT ICD Link-Admin\u0027)]\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027cotv-devxd059\u0027, ip: \u002710.130.5.241\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_25\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73), userDataDir\u003dC:\\Users\\RAJEND~1.PRA\\AppData\\Local\\Temp\\scoped_dir13056_24913}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d67.0.3396.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: a8a3226f9420d59e002abc688e8dd7a3\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(), \u0027CPT ICD Link-Admin\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat com.project.teststeps.TestCase1.screen_will_be_opened_in_a_new_tab_with_title_CPTICD_Links_Admin(TestCase1.java:98)\r\n\tat ✽.And Screen will be opened in a new tab with title CPTICD Links- Admin(F3779 - Establish Operational Audit Functionality.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestCase1.ra_captures_Admin_screen_data_count_by_executing_a_Query()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase1.the_records_count_in_the_Admin_screen_grid_should_match_with_the_DB_count()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestCase1.logout_Application()"
});
formatter.result({
  "status": "skipped"
});
});