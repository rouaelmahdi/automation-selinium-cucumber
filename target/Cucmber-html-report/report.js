$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Tester la page connexion",
  "description": "ETQ utlisateur je souhaite teste la page connexion",
  "id": "tester-la-page-connexion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentication"
    }
  ]
});
formatter.before({
  "duration": 2718490093,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Tester la page connexion",
  "description": "",
  "id": "tester-la-page-connexion;tester-la-page-connexion",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte sur l\u0027application Orange HRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le username",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "je saisie le password",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je clique sur le bouton Login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Je me dérige vers la page Home",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1771301254,
  "status": "passed"
});
});