$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjetoCombo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Localidade de atendimento",
  "description": "",
  "id": "localidade-de-atendimento",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 4,
  "name": "Entrar na localidade",
  "description": "",
  "id": "localidade-de-atendimento;entrar-na-localidade",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 5,
  "name": "uma localidade",
  "rows": [
    {
      "cells": [
        "Localidade"
      ],
      "line": 6
    },
    {
      "cells": [
        "São Paulo"
      ],
      "line": 7
    },
    {
      "cells": [
        "Rio de Janeiro"
      ],
      "line": 8
    },
    {
      "cells": [
        "Distrito Federal"
      ],
      "line": 9
    },
    {
      "cells": [
        "Outros"
      ],
      "line": 10
    }
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "entro",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "eu seleciono que não sou cliente",
  "keyword": "Entao "
});
formatter.match({
  "location": "ProjetoCombo_steps.uma_localidade(DataTable)"
});
formatter.result({
  "duration": 41549404800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/button/div/p[2]/i\"}\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d2.42.591088 (7b2b2dca23cca0862f674758c9a3933e685c27d5),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LUCAPC\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.42.591088 (7b2b2dca23cca0..., userDataDir: C:\\Users\\LUCA\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64050}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.100, webStorageEnabled: true}\nSession ID: ef596b7e1c2f6e552b1543a17f47a3af\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/button/div/p[2]/i}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat ProjetoCombo_steps.uma_localidade(ProjetoCombo_steps.java:38)\r\n\tat ✽.Dado uma localidade(ProjetoCombo.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProjetoCombo_steps.entro()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProjetoCombo_steps.euSelecionoQueNãoSouCliente()"
});
formatter.result({
  "status": "skipped"
});
});