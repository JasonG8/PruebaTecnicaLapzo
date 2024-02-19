package stepDefinitions;

import exceptions.ExcepcionCompra;
import exceptions.ExcepcionInicioDeSesion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.Compra;
import questions.InicioSesion;
import tasks.IniciarSesion;
import tasks.RealizarCompra;
import utils.drivers.MyChromeDriver;

import static exceptions.Excepcion.noInicioSesion;
import static exceptions.Excepcion.noSeRealizoCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.constantes.ConstantManage.ACTOR;
import static utils.constantes.ConstantManage.URL;

public class SauceDemoStepDefinitions {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la pagina Sauce Demo")
    public void elUsuarioNecesitaIngresarALaPaginaAdvantageShoppingParaRegistrarse() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }

    @Cuando("el digita usuario y clave")
    public void elIngresaLaInformacionNecesariaParaCrearElRegistro() {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.sauceDemo());
    }

    @Entonces("el verifica que se ha iniciado correctamente")
    public void elVerificaQueSeHaResgistradoEnElSistema() {
        theActorInTheSpotlight().should(seeThat(InicioSesion.correcto(), Matchers.comparesEqualTo("Products"))
                .orComplainWith(ExcepcionInicioDeSesion.class, noInicioSesion.getMensaje()));
    }

    @Y("el usuario realiza un proceso de compra")
    public void queElUsuarioAgregaUnProductoNuevoAlCarroDeCompras() {
        theActorInTheSpotlight().attemptsTo(RealizarCompra.exitosamente());

    }

    @Entonces("verifica la compra exitosa")
    public void verificaLaCompraExitosa() {
        theActorInTheSpotlight().should(seeThat(Compra.exitosa(), Matchers.comparesEqualTo("Thank you for your order!"))
                .orComplainWith(ExcepcionCompra.class, noSeRealizoCompra.getMensaje()));

    }


}