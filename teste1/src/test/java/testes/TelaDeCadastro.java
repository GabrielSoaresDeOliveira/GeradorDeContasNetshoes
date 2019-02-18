package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TelaDeCadastro {
    @Test
    public void Name (WebDriver navegador, String Nome){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("person-name")).sendKeys(Nome);
    }

    @Test
    public void SobreName (WebDriver navegador, String SobreNome){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("person-last-name")).sendKeys(SobreNome);
    }

    @Test
    public void CPF (WebDriver navegador, String Cpf){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("cpf")).sendKeys(Cpf);
        navegador.findElement(By.id("label-male")).click();
    }

    @Test
    public void CEP (WebDriver navegador, String Cep){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("address-zipcode")).sendKeys(Cep);
        navegador.findElement(By.id("address-number")).sendKeys("12345");
    }
/*
    @Test
    public void Rua (WebDriver navegador, String Endereço, String Num){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("address-name")).sendKeys(Endereço);
        navegador.findElement(By.id("neighborhood")).sendKeys(Endereço);
        Select TipoEnd = new Select(navegador.findElement(By.id("address-street-type")));
        TipoEnd.selectByVisibleText("Rua");
        navegador.findElement(By.id("address-number")).sendKeys(Num);
    }

    @Test
    public void City (WebDriver navegador, String Cidade, String Estado){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("city")).sendKeys(Cidade);
        Select SelectEstado = new Select(navegador.findElement(By.id("address-state")));
        SelectEstado.selectByValue(String.valueOf(Estado));
    }
*/
    @Test
    public void DataNas (WebDriver navegador, String Data){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String dia = Data.substring(0,2);
        String mes = Data.substring(3,5);
        String ano = Data.substring(6);

        Select diaNas = new Select(navegador.findElement(By.id("dateofbirth-day")));
        diaNas.selectByVisibleText(dia);

        Select mesNas = new Select(navegador.findElement(By.id("dateofbirth-month")));
        mesNas.selectByValue(mes);

        Select anoNas = new Select(navegador.findElement(By.id("dateofbirth-year")));
        anoNas.selectByVisibleText(ano);

    }

    @Test
    public void Numeros (WebDriver navegador, String Telefone){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("phones-home")).sendKeys(Telefone);
    }

    @Test
    public void Password (WebDriver navegador, String Senha){

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.findElement(By.id("password")).sendKeys(Senha);
        navegador.findElement(By.id("save-register-natural")).click();
    }

    @Test
    public void Fechar (WebDriver navegador){
        navegador.quit();
    }

}
