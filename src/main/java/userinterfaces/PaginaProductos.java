package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProductos {


    public static final Target buttonAddToCartProductoUno = Target.the("buttonAddToCart")
            .located(By.xpath("(//button[text()='Add to cart'])[1]"));

    public static final Target buttonAddToCartProductoDos = Target.the("buttonAddToCart")
            .located(By.xpath("(//button[text()='Add to cart'])[3]"));

    public static final Target buttonCarrodeCompras = Target.the("buttonAddToCart")
            .located(By.xpath("//a[@class='shopping_cart_link']"));

    public static final Target questionInicioSesion = Target.the("Validacion inicio de sesion")
            .located(By.xpath("//span[text()='Products']"));





    private PaginaProductos() {
    }
}
