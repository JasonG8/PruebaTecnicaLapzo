package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.PaginaYouCart.questionCompra;


public class Compra implements Question <String> {
    public static Compra exitosa() {
        return new Compra();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(questionCompra,isVisible()).forNoMoreThan(60).seconds());
        return Text.of(questionCompra).answeredBy(actor);
    }
}