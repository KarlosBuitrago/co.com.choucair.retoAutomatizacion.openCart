package co.com.choucair.retoAutomatizacion.openCart.runners.clientes;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/clientes/crearCliente.feature",
tags = {"@CrearCliente"},
glue = "co.com.choucair.retoAutomatizacion.openCart.stepDefinitions",
snippets = SnippetType.CAMELCASE)
public class RunnerCrearCliente {
}
