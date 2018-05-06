$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Emirates.feature");
formatter.feature({
  "line": 1,
  "name": "Flight Status",
  "description": "",
  "id": "flight-status",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4661055486,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Bill wants to travel from DXB to LHR",
  "description": "",
  "id": "flight-status;bill-wants-to-travel-from-dxb-to-lhr",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "that Bill has decided to check available flights in \"https://www.yatra.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he looks at a return trip from \"DX \" to \"LH \" leaving one week from now",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "he should be shown the cheapest return ticket from DXB to LHR",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.yatra.com/",
      "offset": 53
    }
  ],
  "location": "EmirtesStepDefinition.that_Bill_has_decided_to_check_available_flights_in(String)"
});
formatter.result({
  "duration": 31328974684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DX ",
      "offset": 32
    },
    {
      "val": "LH ",
      "offset": 41
    }
  ],
  "location": "EmirtesStepDefinition.he_looks_at_a_return_trip_from_to_leaving_one_week_from_now(String,String)"
});
formatter.result({
  "duration": 13433392124,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[contains(.,\u0027Dubai\u0027)]\"}\n  (Session info: chrome\u003d66.0.3359.139)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027SANJIV\u0027, ip: \u0027192.168.203.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\sanjiv\\AppData\\Loc...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 66.0.3359.139, webStorageEnabled: true}\nSession ID: 3e5fc057a82b918119b4ce3acf32c430\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(.,\u0027Dubai\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat Helpers.DriverWaitUtility.waitForElementClickable(DriverWaitUtility.java:45)\r\n\tat StepDefinitions.EmirtesStepDefinition.he_looks_at_a_return_trip_from_to_leaving_one_week_from_now(EmirtesStepDefinition.java:34)\r\n\tat ✽.When he looks at a return trip from \"DX \" to \"LH \" leaving one week from now(Emirates.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EmirtesStepDefinition.he_should_be_shown_the_cheapest_return_ticket_from_DXB_to_LHR()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 6346659572,
  "status": "passed"
});
});