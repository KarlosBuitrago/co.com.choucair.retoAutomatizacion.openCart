package co.com.choucair.retoAutomatizacion.openCart.questions;

import co.com.choucair.retoAutomatizacion.openCart.userinterface.PaginaClientes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCrearCliente implements Question {

    public static ValidarCrearCliente respuesta() {
        return new ValidarCrearCliente();
    }

    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(PaginaClientes.MENSAJE).viewedBy(actor).asString();

    }
}
