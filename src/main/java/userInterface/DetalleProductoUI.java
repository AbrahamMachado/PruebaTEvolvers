package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DetalleProductoUI {
    public static final Target BTN_AGREGAR_CARRITO = Target.the("").
            locatedBy("//a[contains(@onclick,'addToCart')]");
    public static final Target LBL_PRECIO = Target.the("").
            locatedBy("//h3[@class='price-container']");
}
