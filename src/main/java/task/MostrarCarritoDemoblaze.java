package task;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.HomeUI;

public class MostrarCarritoDemoblaze implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.LBL_CART)
        );
    }
    public static MostrarCarritoDemoblaze on(){
        return Instrumented.instanceOf(MostrarCarritoDemoblaze.class).withProperties();
    }
}
