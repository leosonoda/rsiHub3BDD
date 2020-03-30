Feature: Abrir página de produto, através da pesquisa por lupa

Scenario: Usuário pesquisa item na lupa, e abre página do produto com sucesso

	Given estou na página inicial 
	When clico na lupa
	And pesquiso produto 
	And clico no produto exibido na tela
	Then exibe página principal do produto