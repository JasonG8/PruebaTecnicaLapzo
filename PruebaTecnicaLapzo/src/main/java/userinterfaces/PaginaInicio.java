package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {


    public static final Target inputNombreDeUsuario = Target.the("nombreDeUsuario")
            .located(By.xpath("//input[@name='user-name' and @id='user-name']"));

    public static final Target inputClave = Target.the("input clave")
            .located(By.xpath("//input[@id='password']"));

    public static final Target buttonSignIn = Target.the("Boton Sign In")
            .located(By.xpath("//input[@id='login-button']"));


}
