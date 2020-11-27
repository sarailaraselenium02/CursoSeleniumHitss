$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Inicio de sesi�n",
  "description": "In Realizar un login\r\nAs Con usuario valido\r\nI Quiero iniciar sesi�n con �xito",
  "id": "inicio-de-sesi�n",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Acceder exitosamente a la pagina",
  "description": "",
  "id": "inicio-de-sesi�n;acceder-exitosamente-a-la-pagina",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Ingresar a la pagina de saucedemo",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Ingresar usuario y password valido",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Dar clic en login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Deberia ir a la pagina de Products",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginCorrecto.Ingresar_a_la_pagina_de_saucedemo()"
});
formatter.result({
  "duration": 6474527834,
  "status": "passed"
});
formatter.match({
  "location": "LoginCorrecto.Ingresar_usuario_y_password_valido()"
});
formatter.result({
  "duration": 258274197,
  "status": "passed"
});
formatter.match({
  "location": "LoginCorrecto.Dar_clic_en_login()"
});
formatter.result({
  "duration": 1095654123,
  "status": "passed"
});
formatter.match({
  "location": "LoginCorrecto.Deberia_ir_a_la_pagina_de_Products()"
});
formatter.result({
  "duration": 133290034,
  "status": "passed"
});
});