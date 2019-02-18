package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class gerador {

    WebElement email;
    String Email;

    WebElement nome;
    String Nome;

    WebElement sobrenome;
    String SobreNome;

    WebElement cpf;
    String Cpf;

    WebElement cep;
    String Cep;

    WebElement endereço;
    String Endereço;

    WebElement cidade;
    String Cidade;

    WebElement estado;
    String Estado;

    WebElement numero;
    String Numero;

    WebElement data;
    String Data;

    WebElement telefone;
    String Telefone;

    WebElement senha;
    String Senha;

    @Test
    public void PaginaGerador(WebDriver navegador){
        navegador.get("https://www.invertexto.com/gerador-de-pessoas");
        Select Sexo = new Select(navegador.findElement(By.name("gender")));
        Sexo.selectByValue("male");
        Select Nacionalidade = new Select(navegador.findElement(By.name("country")));
        Nacionalidade.selectByValue("BR");
        navegador.findElement(By.xpath("/html/body/main/div/div/div[1]/form/div[3]/div/button")).click();
    }

    //E-mail:
    @Test
    public String GerarEmail(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        email = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[4]/div[1]/input"));
        Email = email.getAttribute("value");

        return Email;
    }
    @Test
    public String getEmail(){
        return Email;
    }

    //Nome:
    @Test
    public String GerarNome(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        nome = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[1]/div[1]/input"));
        Nome = nome.getAttribute("value");

        return Nome;
    }
    @Test
    public String getNome(){
        return Nome;
    }

    //Sobrenome:
    @Test
    public String GerarSobreNome(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sobrenome = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[1]/div[1]/input"));
        SobreNome = sobrenome.getAttribute("value");

        return SobreNome;
    }
    @Test
    public String getSobreNome(){
        return SobreNome;
    }

    //CPF:
    @Test
    public String GerarCpf(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cpf = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[1]/div[2]/input"));
        Cpf = cpf.getAttribute("value");

        return Cpf;
    }
    @Test
    public String getCpf(){
        return Cpf;
    }

    //CEP:
    @Test
    public String GerarCep(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cep = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[3]/div[1]/input"));
        Cep = cep.getAttribute("value");

        return Cep;
    }
    @Test
    public String getCep(){
        return Cep;
    }

   /* //Numero:
    @Test
    public String GerarNumero(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        numero = navegador.findElement(By.xpath("//*[@id=\"gen\"]/table/tbody/tr[6]/td[2]/input"));
        Numero = numero.getAttribute("value");

        return Numero;
    }
    @Test
    public String getNumero(){
        return Numero;
    }

    //Endereço:
    @Test
    public String GerarEndereço(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        endereço = navegador.findElement(By.xpath("//*[@id=\"gen\"]/table/tbody/tr[7]/td[2]/input"));
        Endereço = endereço.getAttribute("value");

        return Endereço;
    }
    @Test
    public String getEndereço(){
        return Endereço;
    }

    //Cidade:
    @Test
    public String GerarCidade(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cidade = navegador.findElement(By.xpath("//*[@id=\"gen\"]/table/tbody/tr[9]/td[2]/input"));
        Cidade = cidade.getAttribute("value");
        return Cidade;

    }
    @Test
    public String getCidade(){
        return Cidade;
    }

    //Estado:
    @Test
    public String GerarEstado(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        estado = navegador.findElement(By.xpath("//*[@id=\"gen\"]/table/tbody/tr[10]/td[2]/input"));
        Estado = estado.getAttribute("value");
        return Estado;

    }*/
    /*@Test
    public String getEstado(){
        return Estado;
    }*/

    //Data de Nascimento:
    @Test
    public String GerarData(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        data = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[2]/div[1]/input"));
        Data = data.getAttribute("value");

        return Data;
    }
    @Test
    public String getData(){
        return Data;
    }

    //Telefone:
    @Test
    public String GerarTelefone(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        telefone = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[1]/div[3]/input"));
        Telefone = telefone.getAttribute("value");

        return Telefone;
    }
    @Test
    public String getTelefone() { return Telefone;}

    //Senha:
    @Test
    public String GerarSenha(WebDriver navegador){
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        senha = navegador.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/section[4]/div[3]/input"));
        Senha = senha.getAttribute("value");

        return Senha;
    }
    @Test
    public String getSenha() { return Senha;}

}
