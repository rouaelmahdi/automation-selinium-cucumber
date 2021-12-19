Feature: Tester la connexion avec un scenario outline
  ETQ utlisateur je souhaite teste la page connexion

  @loginOutline
  Scenario Outline: Tester la connexion avec un scenario outline
    Given Je me connecte sur l'application Orange HRM
    When Je saisie le userName "<username>" 
    And Je saisie le password "<password>"
    And Je clique sur le bouton Login

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Marwa    | marwa123 |
      | Roua     | roua123  |
