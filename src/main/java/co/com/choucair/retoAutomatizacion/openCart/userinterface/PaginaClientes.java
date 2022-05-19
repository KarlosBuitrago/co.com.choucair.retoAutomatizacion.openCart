package co.com.choucair.retoAutomatizacion.openCart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaClientes extends PageObject {

    public static Target MENU_CLIENTES = Target.the("Para acceder al menu clientes")
            .located(By.xpath("//*[@id=\"menu-customer\"]/a"));
    public static Target OPCION_CLIENTES = Target.the("Para seleccionar la ventana de clientes")
            .located(By.xpath("//*[@id=\"collapse33\"]/li[1]/a"));
    public static Target NUEVO_CLIENTE = Target.the("Boton para crear un nuevo clientes")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a"));
    public static Target GRUPO_CLIENTE = Target.the("Campo para elegir el grupo de clientes")
            .located(By.id("input-customer-group"));
    public static Target NOMBRE_CLIENTE = Target.the("Campo para ingresar el nombre del cliente")
            .located(By.id("input-firstname"));
    public static Target APELLIDO_CLIENTE = Target.the("Campo para ingresar el apellido del cliente")
            .located(By.id("input-lastname"));
    public static Target CORREO_CLIENTE = Target.the("Campo para ingresar el correo del cliente")
            .located(By.id("input-email"));
    public static Target TELEFONO_CLIENTE = Target.the("Campo para ingresar el telefono del cliente")
            .located(By.id("input-telephone"));
    public static Target CONTRASEÑA_CLIENTE = Target.the("Campo para ingresar la contraseña del cliente")
            .located(By.id("input-password"));
    public static Target CONFIRMAR_CONTRASEÑA_CLIENTE = Target.the("Campo para ingresar la confirmacion de contraseña del cliente")
            .located(By.id("input-confirm"));
    public static Target BOLETIN_CLIENTE = Target.the("Campo para seleccionar el boletin del cliente")
            .located(By.id("input-newsletter"));
    public static Target ESTADO_CLIENTE = Target.the("Campo para seleccionar el estado del cliente")
            .located(By.id("input-status"));
    public static Target SEGURO_CLIENTE = Target.the("Campo para seleccionar si tiene seguro el cliente")
            .located(By.id("input-safe"));
    public static Target BOTON_CREAR_CLIENTE = Target.the("Boton para crear un nuevo cliente")
            .located(By.xpath("//button[@class='btn btn-primary']"));
    public static Target MENSAJE = Target.the("Mensaje para validar la creacion del cliente")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"));
}

