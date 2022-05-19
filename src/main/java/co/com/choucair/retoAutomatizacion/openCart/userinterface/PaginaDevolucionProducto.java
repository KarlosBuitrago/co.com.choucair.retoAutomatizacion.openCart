package co.com.choucair.retoAutomatizacion.openCart.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDevolucionProducto {

    public static Target MENU_VENTAS = Target.the("Para acceder al menu ventas")
            .located(By.xpath("//*[@id=\"menu-sale\"]/a"));
    public static Target DEVOLUCION_PRODUCTO = Target.the("Para seleccionar la pagina de devolucion de producto")
            .located(By.xpath("//*[@id=\"collapse26\"]/li[3]/a"));
    public static Target BOTON_NUEVA_DEVOLUCION = Target.the("Boton para crear una nueva devolucion")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a"));
    public static Target CAMPO_ID = Target.the("Campo para ingresar el Id de la devolucion")
            .located(By.id("input-order-id"));
    public static Target CAMPO_FECHA = Target.the("Campo para ingresar la fecha")
            .located(By.id("input-date-ordered"));
    public static Target CAMPO_CLIENTE = Target.the("Campo para ingresar el cliente")
            .located(By.id("input-customer"));
    public static Target CAMPO_NOMBRE_CLIENTE = Target.the("Campo para ingresar el nombre del cliente")
            .located(By.id("input-firstname"));
    public static Target CAMPO_APELLIDO_CLIENTE = Target.the("Campo para ingresar el apellido del cliente")
            .located(By.id("input-lastname"));
    public static Target CAMPO_CORREO_CLIENTE = Target.the("Campo para ingresar el correo del cliente")
            .located(By.id("input-email"));
    public static Target CAMPO_TELEFONO_CLIENTE = Target.the("Campo para ingresar el telefono del cliente")
            .located(By.id("input-telephone"));
    public static Target CAMPO_PRODUCTO = Target.the("Campo para ingresar el producto devuelto")
            .located(By.id("input-product"));
    public static Target CAMPO_MODELO = Target.the("Campo para ingresar el modelo del producto")
            .located(By.id("input-model"));
    public static Target CAMPO_CANTIDAD = Target.the("Campo para ingresar la cantidad")
            .located(By.id("input-quantity"));
    public static Target CAMPO_MOTIVO_DEVOLUCION = Target.the("Campo para seleccionar el motivo de la devolucuion")
            .located(By.id("input-return-reason"));
    public static Target CAMPO_ESTADO_CASO = Target.the("Campo para seleccionar el estado de caso")
            .located(By.id("input-opened"));
    public static Target CAMPO_COMENTARIO = Target.the("Campo para ingresar un comentario")
            .located(By.id("input-comment"));
    public static Target CAMPO_ACCION_RETORNO = Target.the("Campo para seleccionar la accion de retorno")
            .located(By.id("input-return-action"));
    public static Target CAMPO_ESTADO_DEVOLUCION = Target.the("Campo para seleccionar el estado de la devolucion")
            .located(By.id("input-return-status"));
    public static Target GUARDAR_DEVOLUCION = Target.the("Boton para guardar la devolucion")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button"));
    public static Target MENSAJE = Target.the("Mensaje para validar la devolucion del producto")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]"));
    
}
