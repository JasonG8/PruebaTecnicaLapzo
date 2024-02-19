package exceptions;

public enum Excepcion {

    noInicioSesion("No se inicio sesion correctamente"),
    noSeRealizoCompra("No se pudo realizar la compra exitosamente");

    String mensaje;

    Excepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }



}