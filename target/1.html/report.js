$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Git/Automation/Features/Demo.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8840483798,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "This is demo test",
  "description": "",
  "id": "title-of-your-feature;this-is-demo-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch the \"https://Google.com\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify the page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://Google.com",
      "offset": 14
    }
  ],
  "location": "DemoStepDefiniton.i_launch_the_page(String)"
});
formatter.result({
  "duration": 2293064713,
  "status": "passed"
});
formatter.match({
  "location": "DemoStepDefiniton.i_verify_the_page()"
});
formatter.result({
  "duration": 35652,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2327447554,
  "status": "passed"
});
});