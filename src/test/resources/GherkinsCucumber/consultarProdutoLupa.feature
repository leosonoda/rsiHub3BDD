Feature: Abrir pagina de produto, através da pesquisa por lupa

Background:
	Given estou na pagina inicial 
	When clico na lupa

Scenario: Usuario pesquisa item na lupa, e abre página do produto com sucesso

	And pesquiso produto
	And clico no produto exibido na tela
	Then exibe pagina principal do produto
	

Scenario: Usuario pesquisa item na lupa, e site nao encontra resultado
	
	And pesquiso produto
	Then exibe pagina de produto nao encontrado