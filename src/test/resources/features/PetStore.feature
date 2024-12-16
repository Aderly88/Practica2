Feature: PetStore API

  @TesPetStore
  Scenario:Consulta mascota

    Given la url es "https://petstore.swagger.io/v2/pet"
    When consulto la mascota con ID "1"
    Then valido el codigo de respuesta sea 200

