Feature: Abrir pagina de produto, clicando nas categorias do menu inicial e depois em um produto


Background:
	Given estou na pagina de inicio


Scenario: Usuario clica em uma categoria no menu inicial e depois em um produto desejado

	When clico na categoria desejada
	And clico no produto desejado  
	Then exibe pagina principal do produto
	
	
Scenario: Usuario tenta clicar em categoria inexistente

	When tento clicar na categoria inexistente
	Then categoria nao e encontrada