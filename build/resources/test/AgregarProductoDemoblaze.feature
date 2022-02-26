Feature: HU-001 Agregar productos al carrito de compras

  Scenario: Agregar productos en Demoblaze
    When ingreso a la pagina web "https://www.demoblaze.com/"
    Given agrego el producto
      |nombreProducto|categoria|
      |Sony vaio i5  |Laptops  |
    Then visualizo los productos agregados en el carrito