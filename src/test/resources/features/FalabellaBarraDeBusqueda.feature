@BarraDeBusqueda

@GoogleSearchCat
Feature: Falabella Barra de búsqueda
  Description: this feature file contains the scenario related to search bar

  Scenario Outline: Validar busqueda de producto a través del SKU
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And busco el SKU 118465120
    And hago click en la lupa
    Then se valida que el SKU corresponda al producto

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Validar busqueda de producto a través del nombre
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And busco el nombre del producto
    And hago click en la lupa
    And selecciono el producto
    Then se valida que el SKU corresponda al producto

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Validar busqueda de producto a través de la marca
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And busco la marca del producto
    And hago click en la lupa
    And selecciono el producto
    Then se valida que el SKU corresponda al producto

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Validar mensaje al ingresar una búsqueda inválida
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And busco la palabra jajkajkajka
    And hago click en la lupa
    Then se valida el mensaje Lo sentimos, no encontramos resultados para

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Validar mensaje al dejar en blanco
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And dejo la barra de busqueda en blanco
    And hago click en la lupa
    Then se valida que muestre el mensaje Busqueda vacia

    Examples:
      | userName           |
      | jrolon@acid.cl     |