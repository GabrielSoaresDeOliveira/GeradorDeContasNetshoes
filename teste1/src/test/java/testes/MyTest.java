package testes;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyTest{
    TelaDeLogin login = new TelaDeLogin();
    Inicio start = new Inicio();
    driver driver = new driver();
    gerador cadastro = new gerador();
    TelaDeCadastro formulario = new TelaDeCadastro();
    Registro dados = new Registro();

    @Test
    public void Testes() {
                driver.Start2();

        for (int i =1; i<=2;i++) {
                driver.Start();

                    cadastro.PaginaGerador(driver.getNavegador());

                    //Dados:
                    cadastro.GerarEmail(driver.getNavegador());
                    cadastro.GerarNome(driver.getNavegador());
                    cadastro.GerarSobreNome(driver.getNavegador());
                    cadastro.GerarCpf(driver.getNavegador());
                    cadastro.GerarCep(driver.getNavegador());
                    /*cadastro.GerarEndereço(driver.getNavegador());
                    cadastro.GerarCidade(driver.getNavegador());
                    cadastro.GerarEstado(driver.getNavegador());
                    cadastro.GerarNumero(driver.getNavegador());*/
                    cadastro.GerarData(driver.getNavegador());
                    cadastro.GerarTelefone(driver.getNavegador());
                    cadastro.GerarSenha(driver.getNavegador());

                    start.PaginaLogin(driver.getNavegador());

                    login.Login(driver.getNavegador(), cadastro.getEmail());
                    formulario.Name(driver.getNavegador(), cadastro.getNome());
                    formulario.SobreName(driver.getNavegador(), cadastro.getSobreNome());
                    formulario.CPF(driver.getNavegador(), cadastro.getCpf());
                    formulario.CEP(driver.getNavegador(), cadastro.getCep());
                    /*formulario.Rua(driver.getNavegador(), cadastro.getEndereço(), cadastro.getNumero());
                    formulario.City(driver.getNavegador(), cadastro.getCidade(), cadastro.getEstado());*/
                    formulario.DataNas(driver.getNavegador(), cadastro.getData());
                    formulario.Numeros(driver.getNavegador(), cadastro.getTelefone());
                    formulario.Password(driver.getNavegador(), cadastro.getSenha());

                    dados.Dados(driver.getNavegador2(), cadastro.getEmail(), cadastro.getSenha());

                    formulario.Fechar(driver.getNavegador());
                   i--; }


                }

    }









