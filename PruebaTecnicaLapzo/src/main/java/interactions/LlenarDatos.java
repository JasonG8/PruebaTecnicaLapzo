package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaProductos.*;
import static userinterfaces.PaginaYouCart.*;
import static utils.constantes.UsuarioAleatorio.generarNombreAleatorio;

public class LlenarDatos implements Interaction {


    public static LlenarDatos elFormulario() {
        return instrumented(LlenarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("user", generarNombreAleatorio());
        actor.attemptsTo(

                WaitUntil.the(buttonCarrodeCompras, isEnabled()),
                Click.on(buttonCarrodeCompras),
                Click.on(buttonCheckOut),
                Enter.theValue(actor.recall("user").toString()).into(inputNombre),
                Enter.theValue("Guzman").into(inputApellido),
                Enter.theValue("08100").into(inputCodigoPostal),
                WaitUntil.the(buttonContinue, isPresent()).forNoMoreThan(60).seconds(),
                Click.on(buttonContinue),
                Click.on(buttonFinish)

        );
    }
}