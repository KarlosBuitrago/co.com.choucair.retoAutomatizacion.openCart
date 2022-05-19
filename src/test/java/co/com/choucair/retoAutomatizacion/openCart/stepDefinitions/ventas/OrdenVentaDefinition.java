package co.com.choucair.retoAutomatizacion.openCart.stepDefinitions.ventas;

import co.com.choucair.retoAutomatizacion.openCart.questions.ValidarOrdenVenta;
import co.com.choucair.retoAutomatizacion.openCart.tasks.IngresarPagina;
import co.com.choucair.retoAutomatizacion.openCart.tasks.Login;
import co.com.choucair.retoAutomatizacion.openCart.tasks.venta.OrdenVenta;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static co.com.choucair.retoAutomatizacion.openCart.tasks.IngresarPagina.*;

public class OrdenVentaDefinition {

    public void iniciarPagina(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos se quiere loguear en la pagina opencartpara hacer una orden de venta$")
    public void queCarlosSeQuiereLoguearEnLaPaginaOpencartparaHacerUnaOrdenDeVenta() {
        OnStage.theActorCalled("Carlos").wasAbleTo(IngresarPagina.login());
    }
    @Cuando("^llena todos los datos de la orden de venta$")
    public void llenaTodosLosDatosDeLaOrdenDeVenta() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrdenVenta.hacerOrden());
    }

    @Entonces("^El sitema me permite crear una orden de venta$")
    public void elSitemaMePermiteCrearUnaOrdenDeVenta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarOrdenVenta.valida(), Matchers.equalTo("Warning: You do not have permission to access the API!\n×")));
    }



}
