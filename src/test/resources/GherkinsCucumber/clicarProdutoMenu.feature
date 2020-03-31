Feature: Abrir pagina de produto, clicando nas categorias do menu inicial e depois em um produto


Background:
	Given estou na pagina inicial 


Scenario: Usuario clica em uma categoria no menu inicial e depois em um produto desejado

	When clico na categoria desejado
	And clico no produto desejado  
	Then exibe pagina principal do produto
	
	
	
	
Scenario: Usuario tenta clicar em categoria inexistente

	When tento clico na categoria inexistente
	Then categoria nao é encontrada