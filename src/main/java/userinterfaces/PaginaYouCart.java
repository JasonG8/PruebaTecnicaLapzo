package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaYouCart {

    public static final Target buttonCheckOut  = Target.the("Boton para verificar compra")
            .located(By.xpath("//button[@id='checkout']"));

    public static final Target inputNombre  = Target.the("Campo de texto para ingresar Nombre")
            .located(By.xpath("//input[@id='first-name']"));

    public static final Target inputApellido  = Target.the("Campo de texto para ingresar Apellido")
            .located(By.xpath("//input[@id='last-name']"));

    public static final Target inputCodigoPostal  = Target.the("Campo de texto para ingresar Codigo Postal")
            .located(By.xpath("//input[@id='postal-code']"));

    public static final Target buttonContinue  = Target.the("Boton para continuar compra")
            .located(By.xpath("//input[@id='continue']"));

    public static final Target buttonFinish  = Target.the("Boton para finalizar compra")
            .located(By.xpath("//button[@id='finish']"));

    public static final Target questionCompra = Target.the("Validacion compra")
            .located(By.xpath("//h2[text()='Thank you for your order!']"));

}
