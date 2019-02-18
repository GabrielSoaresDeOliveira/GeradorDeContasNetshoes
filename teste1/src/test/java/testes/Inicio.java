package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Inicio {

    @Test
     public void PaginaLogin(WebDriver navegador){
        navegador.get("https://www.netshoes.com.br/");

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.linkText("Entrar")).click();
        navegador.findElement(By.linkText("Login")).click();

    }
}
