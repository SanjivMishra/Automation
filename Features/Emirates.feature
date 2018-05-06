Feature: Flight Status

@Regression1
Scenario: Bill wants to travel from DXB to LHR
Given that Bill has decided to check available flights in "https://www.yatra.com/"
When he looks at a return trip from "DXB" to "LHR" leaving one week from now
Then he should be shown the cheapest return ticket from DXB to LHR