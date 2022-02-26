package task;

import interations.EsperaIteration;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.DetalleProductoUI;
import userInterface.HomeUI;
import userInterface.LaptopsUI;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarProductoDemoblaze implements Task {

    private String nomProducto;
    private String categoria;
    public AgregarProductoDemoblaze(String nomProducto, String categoria){
        this.nomProducto = nomProducto;
        this.categoria = categoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(HomeUI.LBL_CATEGORIA.of(categoria)),
                WaitUntil.the(LaptopsUI.LBL_PRODUCTOS.of(nomProducto), isClickable()).forNoMoreThan(10).seconds(),
                Click.on(LaptopsUI.LBL_PRODUCTOS.of(nomProducto)),
                Click.on(DetalleProductoUI.BTN_AGREGAR_CARRITO),
                EsperaIteration.on(),
                Click.on(HomeUI.LBL_HOME)
        );
    }

    public static AgregarProductoDemoblaze on(String nomProducto, String categoria){
        return Instrumented.instanceOf(AgregarProductoDemoblaze.class).withProperties(nomProducto,categoria);
    }
}
