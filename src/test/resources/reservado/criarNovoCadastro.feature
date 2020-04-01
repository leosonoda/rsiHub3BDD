Feature: Criar novo cadastro no site

Background:
	Given estou no site inicial
	When clico no menu login 
	And clico no menu criacao de conta 
	And preencho campo email
	And preencho campo senha
	And preencho campo confirmacao de senha
	And preencho campo nome
	And preencho campo sobrenome
	And preencho campo telefone
	And seleciono pais
	And preencho campo cidade
	And preencho campo endereco
	And preencho campo estado
	And preencho campo codigo postal
	And clico em aceitar termos
	
@Positivo
Scenario: Usuario cria novo cadastro com sucesso

	And preencho campo usuario valido
	And clico no botao registrar
	Then realiza cadastro com sucesso
	
@Negativo
Scenario: Usuario tenta cadastrar um username ja existe e cadastro falha

	And preencho campo usuario ja existente
	And clico no botao registrar com username repetido
	Then sistema exibe informacao de username ja existente