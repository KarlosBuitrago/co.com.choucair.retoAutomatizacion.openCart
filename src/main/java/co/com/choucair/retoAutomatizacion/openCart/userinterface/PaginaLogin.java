package co.com.choucair.retoAutomatizacion.openCart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/dashboard")
public class PaginaLogin extends PageObject {
    public static Target CAMPO_USUARIO = Target.the("Campo para ingresar usuario")
            .located(By.id("input-username"));
    public static Target CAMPO_CONTRASEÑA = Target.the("Campo para ingresar contraseña")
            .located(By.id("input-password"));
    public static Target BOTON_LOGIN = Target.the("Da click para ingresar a la pagina principal")
            .located(By.xpath("//button[@class='btn btn-primary']"));
}