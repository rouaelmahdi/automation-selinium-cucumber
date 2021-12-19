@authentication
Feature: Tester la page connexion
  ETQ utlisateur je souhaite teste la page connexion

  Background: 
    Given Je me connecte sur l'application Orange HRM

  @cnx
  Scenario: Tester la page connexion
    When Je saisie le username "Admin"
    And je saisie le password "admin123"
    And Je clique sur le bouton Login
    Then Je me dérige vers la page Home "Welcome"

  @logout
  Scenario: Tester la deconnexion
    When je clique sur le logout
    When je clique sur logout
