@Login
Feature: Falabella Login
  Description: this feature file contains the scenario related to Web Login

  Scenario Outline: Login con usuario y contraseña correcto
    Given que quiero loguearme en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And ingreso un usuario correcto
    And ingreso una contraseña correcta
    And hago click en el botón ingresar
    Then el sitio debe mostrar mi nombre indicando que estoy logueado en forma correcta

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login con usuario incorrecto
    Given que quiero validar mensaje de error en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    When ingreso un usuario incorrecto
    And ingreso una contraseña correcta
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje Por favor, ingresa un correo válido.

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login con contraseña incorrecto
    Given que quiero validar mensaje de error de contraseña en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And ingreso un usuario correcto
    And ingreso una contraseña incorrecta
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje de error

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login con usuario en blanco
    Given que quiero validar mensaje de error en el email
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And dejo el campo usuario vacio
    And ingreso una contraseña correcta
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje Ingresa un correo electrónico

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login con contraseña en blanco
    Given que quiero validar mensaje de error en el la contraseña
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And ingreso un usuario correcto
    And dejo el campo contraseña vacio
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje Ingresa una contraseña

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login con usuario y contraseña en blanco
    Given que quiero validar mensaje de error en el los dos campos
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And dejo el campo usuario vacio empty
    And dejo el campo contraseña vacio empty
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje de error en los dos campos

    Examples:
      | userName           |
      | jrolon@acid.cl     |

  Scenario Outline: Login usuario no permita caracteres especiales
    Given que quiero validar mensaje de error en el sitio
      | <userName> |
    When ingreso a www.falabella.cl
    And hago click en el botón Iniciar Sesión
    And ingreso un usuario con caracteres especiales
    And ingreso una contraseña correcta
    And hago click en el botón ingresar
    Then el sitio debe mostrar mensaje Por favor, ingresa un correo válido.

    Examples:
      | userName           |
      | jrolon@acid.cl     |

