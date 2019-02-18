package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TelaDeLogin {
    @Test
    public void Login (WebDriver navegador, String Email){

        //String Email = "abcdefg@1234.com";
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.name("sign-up-username")).sendKeys(Email);
        navegador.findElement(By.id("verify-email-button")).click();


    }

}
