@authentication
Feature: Tester la page connexion
  ETQ utlisateur je souhaite teste la page connexion

  @cnx
  Scenario: Tester la page connexion
    Given Je me connecte sur l'application Orange HRM

    When Je saisie le username 
    And je saisie le password
    And Je clique sur le bouton Login
    Then Je me dérige vers la page Home


 