package steps;

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

public class consultarProdutoLupa_Steps {

	private WebDriver driver;
	private paginaInicial pesquisaNova = new paginaInicial(driver);
	private paginaBusca buscaNova = new paginaBusca(driver);
	private paginasProdutos produtoNovo = new paginasProdutos(driver);
	

	@Given("^estou na pagina inicial$")
	public void estouNaPaginaInicial() throws Throwable {
		driver = navegador.abrirChrome();

		pesquisaNova = PageFactory.initElements(driver, paginaInicial.class);

	}

	@When("^clico na lupa$")
	public void clicoNaLupa() throws Throwable {
		pesquisaNova.acessarLupa();

	}

	@When("^pesquiso produto$")
	public void pesquisoProduto() throws Throwable {

		String palavraBuscaP = "mouse";

		pesquisaNova.pesquisarLupa(palavraBuscaP);

	}

	@When("^clico no produto exibido na tela$")
	public void clicoNoProdutoExibidoNaTela() throws Throwable {

		String produto = "HP Z4000 Wireless Mouse";
		
		buscaNova.clicarProdutoPaginaBusca(produto);

	}

	@Then("^exibe pagina do produto$")
	public void exibePaginaDoProduto() throws Throwable {
		
		String produto = "HP Z4000 Wireless Mouse";
		
		Assert.assertEquals(produto.toUpperCase(), produtoNovo.pegarTituloProduto().getText());

		navegador.fecharChrome(driver);

	}

	@When("^pesquiso produto inexistente$")
	public void pesquisoProdutoInexistente() throws Throwable {
		
		String palavraBuscaN = "monitor";

		pesquisaNova.pesquisarLupa(palavraBuscaN);

	}

	@Then("^exibe pagina de produto nao encontrado$")
	public void exibePaginaDeProdutoNaoEncontrado() throws Throwable {
		
		Assert.assertEquals("No results for \"monitor\"", buscaNova.buscaInexistente());

		navegador.fecharChrome(driver);

	}

}