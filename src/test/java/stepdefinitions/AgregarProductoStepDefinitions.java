package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import models.Producto;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import task.AgregarProductoDemoblaze;
import task.MostrarCarritoDemoblaze;
import userInterface.CarritoIU;

import java.util.List;

public class AgregarProductoStepDefinitions {

    @Before
    public void before(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^ingreso a la pagina web \"([^\"]*)\"$")
    public void ingresoALaPaginaWeb(String url) {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(url)));
    }

    @Given("^agrego el producto$")
    public void agregoElProducto(List<Producto> productos) {
        for (int i=0;i<productos.size();i++){
            OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoDemoblaze.on(productos.get(i).getNombreProducto(),productos.get(i).getCategoria()));
        }
        OnStage.theActorInTheSpotlight().attemptsTo(MostrarCarritoDemoblaze.on());
    }


    @Then("^visualizo los productos agregados en el carrito$")
    public void visualizoLosProductosAgregadosEnElCarrito() {
        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.seeThat(WebElementQuestion.the(CarritoIU.LBL_TOTAL),
                        WebElementStateMatchers.containsText("2120")));
    }
}
