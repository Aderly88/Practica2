Feature: PetStore API

  @consulta
  Scenario:Consulta mascota

    Given la url es "https://petstore.swagger.io/v2"
    When consulto la mascota con ID "2"
    Then valido el codigo de respuesta sea 404
    And valido que el nombre de la mascota sea "Yango"

