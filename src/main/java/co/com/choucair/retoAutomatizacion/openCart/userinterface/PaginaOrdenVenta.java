package co.com.choucair.retoAutomatizacion.openCart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaOrdenVenta extends PageObject {

    public static Target MENU_VENTAS = Target.the("Para acceder al menu ventas")
            .located(By.xpath("//*[@id=\"menu-sale\"]/a"));
    public static Target OPCION_ORDENES = Target.the("Para seleccionar la pagina de orden de ventas")
            .located(By.xpath("//*[@id=\"collapse26\"]/li[1]/a"));
    public static Target BOTON_NUEVA_ORDEN = Target.the("Boton para crear una nueva orden de venta")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a"));
    public static Target CAMPO_TIENDA = Target.the("Campo para seleccionar la tienda")
            .located(By.id("input-store"));
    public static Target CAMPO_DIVISA = Target.the("Campo para seleccionar la divisa")
            .located(By.id("input-currency"));
    public static Target CAMPO_CLIENTE = Target.the("Campo para ingresar el cliente")
            .located(By.id("input-customer"));
    public static Target CAMPO_GRUPO_CLIENTE = Target.the("Campo para seleccionar el grupo al que pertence el cliente")
            .located(By.id("input-customer-group"));
    public static Target CAMPO_NOMBRE = Target.the("Campo para ingresar el nombre del cliente")
            .located(By.id("input-firstname"));
    public static Target CAMPO_APELLIDO = Target.the("Campo para ingresar el apellido del cliente")
            .located(By.id("input-lastname"));
    public static Target CAMPO_CORREO = Target.the("Campo para ingresar el correo del cliente")
            .located(By.id("input-email"));
    public static Target CAMPO_TELEFONO = Target.the("Campo para ingresar el telefono del cliente")
            .located(By.id("input-telephone"));
    public static Target BOTON_CONTINUAR = Target.the("Boton para crear la orden de venta")
            .located(By.xpath("//*[@id=\"button-customer\"]"));
    public static Target MENSAJE = Target.the("Mensaje para validar la venta")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"));
}
