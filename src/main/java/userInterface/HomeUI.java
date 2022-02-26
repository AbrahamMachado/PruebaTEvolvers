package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static final Target LBL_CATEGORIA = Target.the("").
            locatedBy("//a[contains(text(),'{0}')]");
    public static final Target LBL_HOME = Target.the("").
            locatedBy("//a[contains(text(),'Home')]");
    public static final Target LBL_CART = Target.the("").
            locatedBy("//a[contains(text(),'Cart')]");
}
