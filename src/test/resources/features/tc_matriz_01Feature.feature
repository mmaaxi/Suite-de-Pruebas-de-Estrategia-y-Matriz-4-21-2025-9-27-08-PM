Feature: Verificar la matriz

  Scenario: Revisar matriz
    Given I am on the matriz page
    When I retrieve the matriz data
    Then the matriz should contain correct data