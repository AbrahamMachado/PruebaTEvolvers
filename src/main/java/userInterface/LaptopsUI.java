package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopsUI {
    public static final Target LBL_PRODUCTOS = Target.the("").
            locatedBy("//a[contains(text(),'{0}')]");
}
