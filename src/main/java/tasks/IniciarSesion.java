package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.PaginaInicio.*;
import static utils.constantes.ConstantManage.PASSWORD;
import static utils.constantes.ConstantManage.USER;


public class IniciarSesion implements Task {
    public static IniciarSesion sauceDemo() {
        return Tasks.instrumented(IniciarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(inputNombreDeUsuario, isPresent()).forNoMoreThan(60).seconds(),
                Enter.theValue(USER).into(inputNombreDeUsuario),
                Enter.theValue(PASSWORD).into(inputClave),
                Click.on(buttonSignIn)
        );
    }
}