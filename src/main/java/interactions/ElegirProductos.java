package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaProductos.*;

public class ElegirProductos implements Interaction {

    public static ElegirProductos deLaTienda() {
        return Tasks.instrumented(ElegirProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(buttonAddToCartProductoUno, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonAddToCartProductoUno),
                WaitUntil.the(buttonAddToCartProductoUno, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonAddToCartProductoDos)
        );

    }
}
