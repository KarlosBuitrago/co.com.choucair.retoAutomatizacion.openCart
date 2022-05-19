package co.com.choucair.retoAutomatizacion.openCart.tasks.cliente;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaClientes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaClientes.*;

public class CrearCliente implements Task {

    private PaginaClientes paginaClientes;

    public static CrearCliente llenarCampos() {
        return Tasks.instrumented(CrearCliente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_CLIENTES),
                Click.on(OPCION_CLIENTES),
                Click.on(NUEVO_CLIENTE),
                SelectFromOptions.byVisibleText("Default").from(GRUPO_CLIENTE),
                Enter.theValue("Pepito Andres").into(NOMBRE_CLIENTE),
                Enter.theValue("Tocancipa").into(APELLIDO_CLIENTE),
                Enter.theValue("pepito@gmail.com").into(CORREO_CLIENTE),
                Enter.theValue("6082323232").into(TELEFONO_CLIENTE),
                Enter.theValue("pepito@g").into(CONTRASEÑA_CLIENTE),
                Enter.theValue("pepito@g").into(CONFIRMAR_CONTRASEÑA_CLIENTE),
                SelectFromOptions.byVisibleText("Disabled").from(BOLETIN_CLIENTE),
                SelectFromOptions.byVisibleText("Enabled").from(ESTADO_CLIENTE),
                SelectFromOptions.byVisibleText("Yes").from(SEGURO_CLIENTE),
                Click.on(BOTON_CREAR_CLIENTE)
        );
    }
}

