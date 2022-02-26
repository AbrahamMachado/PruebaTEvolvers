package interations;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class EsperaIteration implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(2000);
            BrowseTheWeb.as(actor).getAlert().accept();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static EsperaIteration on(){
        return Instrumented.instanceOf(EsperaIteration.class).withProperties();
    }
}
