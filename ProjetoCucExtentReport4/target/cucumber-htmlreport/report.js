$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AbrirBrowserFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Site",
  "description": "",
  "id": "site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Abrir com Browser",
  "description": "",
  "id": "site;abrir-com-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "eu acesso o site \"http://www.terra.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "entro na pagina principal",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.terra.com.br",
      "offset": 18
    }
  ],
  "location": "AbrirBrowserFeatureSteps.euAcessoOSite(String)"
});
formatter.result({
  "duration": 32508194400,
  "status": "passed"
});
formatter.match({
  "location": "AbrirBrowserFeatureSteps.entroNaPaginaPrincipal()"
});
formatter.result({
  "duration": 716757800,
  "status": "passed"
});
});