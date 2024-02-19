package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaProductos.questionInicioSesion;

public class InicioSesion implements Question <String> {
    public static InicioSesion correcto() {
        return new InicioSesion();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(questionInicioSesion,isVisible()).forNoMoreThan(60).seconds());
        return Text.of(questionInicioSesion).answeredBy(actor);
    }
}