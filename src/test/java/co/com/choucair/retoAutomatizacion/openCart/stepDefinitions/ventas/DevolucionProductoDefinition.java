package co.com.choucair.retoAutomatizacion.openCart.stepDefinitions.ventas;

import co.com.choucair.retoAutomatizacion.openCart.questions.ValidarDevolucionProducto;
import co.com.choucair.retoAutomatizacion.openCart.tasks.venta.DevolucionProducto;
import co.com.choucair.retoAutomatizacion.openCart.tasks.IngresarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class DevolucionProductoDefinition {

    @Before
    public void llamarPagina(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que Carlos se quiere loguear en la pagina opencartpara hacer una devolucion de un producto$")
    public void queCarlosSeQuiereLoguearEnLaPaginaOpencartparaHacerUnaDevolucionDeUnProducto() {
        OnStage.theActorCalled("Carlos").wasAbleTo(IngresarPagina.login());
    }

    @Cuando("^llena todos los datos del producto a devolver$")
    public void llenaTodosLosDatosDelProductoADevolver() {
        OnStage.theActorInTheSpotlight().attemptsTo(DevolucionProducto.duvuelve());
    }

    @Entonces("^El sitema debe permitirle guardar la devolucion del producto$")
    public void elSitemaDebePermitirleGuardarLaDevolucionDelProducto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarDevolucionProducto.devuelto(), Matchers.equalTo("Warning: You do not have permission to modify returns!\n×")));
    }
}
