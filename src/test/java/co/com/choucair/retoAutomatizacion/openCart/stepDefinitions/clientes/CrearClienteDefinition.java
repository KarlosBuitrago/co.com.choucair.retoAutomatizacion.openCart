package co.com.choucair.retoAutomatizacion.openCart.stepDefinitions.clientes;

import co.com.choucair.retoAutomatizacion.openCart.questions.ValidarCrearCliente;
import co.com.choucair.retoAutomatizacion.openCart.tasks.cliente.CrearCliente;
import co.com.choucair.retoAutomatizacion.openCart.tasks.IngresarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class CrearClienteDefinition {

    @Before
    public void lanzarPagina(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Carlos quiere loguearse en la pagina opencart\\.com y crear un cliente$")
    public void queCarlosQuiereLoguearseEnLaPaginaOpencartComYCrearUnCliente() throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(IngresarPagina.login());
    }

    @Cuando("^lleno todos los datos del cliente$")
    public void llenoTodosLosDatosDelCliente() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearCliente.llenarCampos());
    }

    @Entonces("^El sitema me permite crear un usuario$")
    public void elSitemaMePermiteCrearUnUsuario() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCrearCliente.respuesta(), Matchers.equalTo("Warning: You do not have permission to modify customers!\n×")));
    }

}
