Feature: Abrir p�gina de produto, atrav�s da pesquisa por lupa

Scenario: Usu�rio pesquisa item na lupa, e abre p�gina do produto com sucesso

	Given estou na p�gina inicial 
	When clico na lupa
	And pesquiso produto 
	And clico no produto exibido na tela
	Then exibe p�gina principal do produto