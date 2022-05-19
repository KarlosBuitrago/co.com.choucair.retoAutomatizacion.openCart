package co.com.choucair.retoAutomatizacion.openCart.questions;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaOrdenVenta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarOrdenVenta implements Question {

    private PaginaOrdenVenta paginaOrdenVenta;

    public static ValidarOrdenVenta valida() {
        return new ValidarOrdenVenta();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaOrdenVenta.MENSAJE).viewedBy(actor).asString();
    }
}
