Feature: Realizar login no site

Background:
	Given estou na pagina inicial 
	When clico no menu login 
	And preencho campo senha

Scenario: Usuario faz login com sucesso

	And preencho campo usuario
	And clico no botao logar
	Then faco o login com sucesso
	


Scenario: Usuario insere username incorreto e login falha

	And preencho campo usuario incorretamente
	And clico no botao logar
	Then sistema exibe mensagem de username incorreto e login falha