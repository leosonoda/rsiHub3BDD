Feature: Abrir pagina de produto, atrav�s da pesquisa por lupa

Background:
	Given estou na pagina inicial
	When clico na lupa



Scenario: Usuario pesquisa item na lupa, e abre p�gina do produto com sucesso

	And pesquiso produto
	And clico no produto exibido na tela
	Then exibe pagina do produto
	

Scenario: Usuario pesquisa item na lupa, e site nao encontra resultado
	
	And pesquiso produto inexistente
	Then exibe pagina de produto nao encontrado