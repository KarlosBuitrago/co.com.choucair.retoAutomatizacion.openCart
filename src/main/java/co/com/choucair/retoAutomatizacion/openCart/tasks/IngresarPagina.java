package co.com.choucair.retoAutomatizacion.openCart.tasks;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaLogin.*;

public class IngresarPagina  implements Task {

    private PaginaLogin paginaLogin;

    public static IngresarPagina login() {
        return Tasks.instrumented(IngresarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaLogin),
                Enter.theValue("demo").into(CAMPO_USUARIO),
                Enter.theValue("demo").into(CAMPO_CONTRASEÑA),
                Click.on(BOTON_LOGIN)
        );
    }
}
