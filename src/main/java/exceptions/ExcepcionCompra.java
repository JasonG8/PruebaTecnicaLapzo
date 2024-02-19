package exceptions;

public class ExcepcionCompra extends AssertionError{

    public ExcepcionCompra(String message, Throwable cause) {
        super(message, cause);
    }
}
