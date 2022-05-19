#Autor Carlos Julio Buitrago
# language: es
  @CrearCliente
  Característica: Crear clientes en el sistema

    Yo como usuario del sistema quiero crear un cliente para que este haga compras online

    Escenario: crear cliente para que haga compra online
      Dado que Carlos quiere loguearse en la pagina opencart.com y crear un cliente
      Cuando lleno todos los datos del cliente
      Entonces El sitema me permite crear un usuario


    Escenario: crear una orden de venta en el sistema
      Dado que Carlos se quiere loguear en la pagina opencartpara hacer una orden de venta
      Cuando llena todos los datos de la orden de venta
      Entonces El sitema me permite crear una orden de venta

    Escenario: Crear una devolucion de producto
      Dado que Carlos se quiere loguear en la pagina opencartpara hacer una devolucion de un producto
      Cuando llena todos los datos del producto a devolver
      Entonces El sitema debe permitirle guardar la devolucion del producto
