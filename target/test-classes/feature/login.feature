Feature: Inicio de sesión
  In Realizar un login
  As Con usuario valido
  I Quiero iniciar sesión con éxito

  @tag1
  Scenario: Acceder exitosamente a la pagina
    Given Ingresar a la pagina de saucedemo
    When Ingresar usuario y password valido
    Then Dar clic en login 
    Then Deberia ir a la pagina de Products