package exceptions;

public class ExcepcionInicioDeSesion extends AssertionError{

    public ExcepcionInicioDeSesion(String message, Throwable cause) {
        super(message, cause);
    }
}
