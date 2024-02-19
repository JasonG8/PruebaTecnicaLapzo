package tasks;

import interactions.ElegirProductos;
import interactions.LlenarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class RealizarCompra implements Task {
    public static RealizarCompra exitosamente() {
        return Tasks.instrumented(RealizarCompra.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ElegirProductos.deLaTienda(),
                LlenarDatos.elFormulario());

    }
}
