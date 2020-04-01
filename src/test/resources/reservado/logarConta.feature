Feature: Realizar login no site

Background:
	Given estou na home page do site
	When clico no menu para logar 
	And preencho campo de password


@Positivo
Scenario: Usuario faz login com sucesso

	And preencho campo usuario correto
	And clico no botao logar 
	Then faco o login com sucesso
	

@Negativo
Scenario: Usuario insere username incorreto e login falha

	And preencho campo usuario incorretamente
	And clico no botao logar com dados incorretos
	Then sistema exibe mensagem de username incorreto e login falha