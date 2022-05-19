package co.com.choucair.retoAutomatizacion.openCart.tasks.venta;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaOrdenVenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaOrdenVenta.*;

public class OrdenVenta implements Task {

    private PaginaOrdenVenta paginaOrdenVenta;

    public static OrdenVenta hacerOrden() {
        return Tasks.instrumented(OrdenVenta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_VENTAS),
                Click.on(OPCION_ORDENES),
                Click.on(BOTON_NUEVA_ORDEN),
                SelectFromOptions.byVisibleText("Default").from(CAMPO_TIENDA),
                SelectFromOptions.byVisibleText("US Dollar").from(CAMPO_DIVISA),
                Enter.theValue("Homero Juárez").into(CAMPO_CLIENTE),
                SelectFromOptions.byVisibleText("Default").from(CAMPO_GRUPO_CLIENTE),
                Enter.theValue("Homero").into(CAMPO_NOMBRE),
                Enter.theValue("Juárez").into(CAMPO_APELLIDO),
                Enter.theValue("lorena.barraza@sofmail.com").into(CAMPO_CORREO),
                Enter.theValue("3182217561").into(CAMPO_TELEFONO),
                Click.on(BOTON_CONTINUAR)
        );
    }
}
