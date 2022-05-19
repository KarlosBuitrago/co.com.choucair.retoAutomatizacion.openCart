package co.com.choucair.retoAutomatizacion.openCart.tasks.venta;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaDevolucionProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaDevolucionProducto.*;

public class DevolucionProducto implements Task {

    private PaginaDevolucionProducto paginaDevolucionProducto;

    public static DevolucionProducto duvuelve() {
        return Tasks.instrumented(DevolucionProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_VENTAS),
                Click.on(DEVOLUCION_PRODUCTO),
                Click.on(BOTON_NUEVA_DEVOLUCION),
                Enter.theValue("30225").into(CAMPO_ID),
                Click.on(BOTON_FECHA),
                Click.on(SUPERIOR_MES_AÑO_ACTUAL),
                Click.on(SUPERIOR_AÑO),
                Click.on(SELECCIONAR_AÑO),
                Click.on(SELECCIONAR_MES),
                Click.on(SELECCIONAR_DIA),
                Enter.theValue("Pepito Perez").into(CAMPO_CLIENTE),
                Enter.theValue("Pepito").into(CAMPO_NOMBRE_CLIENTE),
                Enter.theValue("Perez").into(CAMPO_APELLIDO_CLIENTE),
                Enter.theValue("pepitoperez@gmaiz.com").into(CAMPO_CORREO_CLIENTE),
                Enter.theValue("3125555222").into(CAMPO_TELEFONO_CLIENTE),
                Enter.theValue("Camara Cannon").into(CAMPO_PRODUCTO),
                Enter.theValue("EOS2000D").into(CAMPO_MODELO),
                Enter.theValue("1").into(CAMPO_CANTIDAD),
                SelectFromOptions.byVisibleText("Received Wrong Item").from(CAMPO_MOTIVO_DEVOLUCION),
                SelectFromOptions.byVisibleText("Opened").from(CAMPO_ESTADO_CASO),
                Enter.theValue("Articulo diferente al que debia llegar").into(CAMPO_COMENTARIO),
                SelectFromOptions.byVisibleText("Replacement Sent").from(CAMPO_ACCION_RETORNO),
                SelectFromOptions.byVisibleText("Pending").from(CAMPO_ESTADO_DEVOLUCION),
                Click.on(GUARDAR_DEVOLUCION)
        );
    }
}
