package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Registro {


    @Test
    public void Dados(WebDriver navegador2, String Email, String Senha){
        navegador2.findElement(By.name("notecontent")).sendKeys("Email: "+Email+"\n");
        navegador2.findElement(By.name("notecontent")).sendKeys("Senha: "+Senha+"\n\n");
    }
}
