package steps;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.RsiHub3.ProjetoHubBDD.comum.navegador;
import br.com.RsiHub3.ProjetoHubBDD.pagesObjects.paginaBusca;
import br.com.RsiHub3.ProjetoHubBDD.pagesObjects.paginaInicial;
import br.com.RsiHub3.ProjetoHubBDD.pagesObjects.paginasProdutos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clicarProdutoMenu_Steps {
	
	private WebDriver driver;
	private paginaInicial pesquisaNova = new paginaInicial(driver);
	private paginaBusca buscaNova = new paginaBusca(driver);
	private paginasProdutos produtoNovo = new paginasProdutos(driver);
	private List<String> teste;
	  
	
	@Given("^estou na pagina de inicio$")
	public void estouNaPaginaDeInicio() throws Throwable {
		driver = navegador.abrirChrome();
		
		pesquisaNova = PageFactory.initElements(driver, paginaInicial.class);
				
	}

	@When("^clico na categoria desejada$")
	public void clicoNaCategoriaDesejada() throws Throwable {
		
		pesquisaNova.clicarNaCategoria("headphonesTxt");

	}

	@When("^clico no produto desejado$")
	public void clicoNoProdutoDesejado() throws Throwable {
		String produto = "Beats Studio 2 Over-Ear Matte Black Headphones";
				
		buscaNova.clicarProdutoPaginaBusca(produto);
	}

	@Then("^exibe pagina principal do produto$")
	public void exibePaginaPrincipalDoProduto() throws Throwable {
		String produto = "Beats Studio 2 Over-Ear Matte Black Headphones";
		
        Assert.assertEquals(produto.toUpperCase(), produtoNovo.pegarTituloProduto().getText());
        
        navegador.fecharChrome(driver);


	}

	@When("^tento clicar na categoria inexistente$")
	public void tentoClicarNaCategoriaInexistente() throws Throwable {
		
		teste = pesquisaNova.listarCategoriasTela();

	}

	@Then("^categoria nao e encontrada$")
	public void categoriaNaoEEncontrada() throws Throwable {
		String produto = "TECLADO";
		
		Assert.assertFalse(teste.contains(produto));
		
		navegador.fecharChrome(driver);		

	}
	
}
	
