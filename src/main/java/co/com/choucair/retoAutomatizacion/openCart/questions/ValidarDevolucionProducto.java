package co.com.choucair.retoAutomatizacion.openCart.questions;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaDevolucionProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarDevolucionProducto implements Question {
    public static ValidarDevolucionProducto devuelto() {
        return new ValidarDevolucionProducto();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PaginaDevolucionProducto.MENSAJE).viewedBy(actor).asString();
    }
}
