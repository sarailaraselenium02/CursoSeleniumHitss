Feature: Inicio de sesi�n
  In Realizar un login
  As Con usuario valido
  I Quiero iniciar sesi�n con �xito

  @tag1
  Scenario: Acceder exitosamente a la pagina
    Given Ingresar a la pagina de saucedemo
    When Ingresar usuario y password valido
    Then Dar clic en login 
    Then Deberia ir a la pagina de Products