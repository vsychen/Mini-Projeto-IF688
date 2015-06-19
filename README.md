Universidade Federal de Pernambuco
Centro de Informática (CIn)
Professor: Marcelo D'Amorim
Aluno: Victor Sin Yu Chen					Login: vsyc


IF688 - Mini projeto - WALA

	Teste
Foi criado um arquivo chamado Teste.java com os seguintes métodos
- Show
	Input: lista de double
	Output: String

	Método para imprimir listas de double
- Soma
	Input: lista de double
	Output: double

	Faz a soma de todos os elementos da lista de double
- Subtracao
	Input: lista de double
	Output: double

	Subtrai do primeiro elemento da lista de double todos os outros elementos da lista
	List (10, 5, 4) => ((10 - 5) - 4) = 1
- Multiplicacao
	Input: lista de double
	Output: double

	Faz a multiplicação de todos os elementos da lista de double
- Divisao
	Input: lista de double
	Output: double

	Divide o primeiro elemento da lista de double pelo segundo elemento, pega o quociente desta divisão e o divide pelo terceiro elemento e assim sucessivamente.
	List (20, 5, 4) => ((20 / 5) / 4) = 1
- Pow
	Input: double, int
	Output: double

	Multiplica a base, que é um double, n vezes (onde n é um inteiro) 
- Pow
	Input: lista de double, int
	Output: lista de double

	Eleva todos os elementos da lista de double de acordo com o inteiro recebido
- Factorial
	Input: int
	Output: double

	Faz o fatorial de um inteiro
- Combination
	Input: int, int
	Output: double

	Recebe dois inteiros e retorna a combinação deles
	Fórmula: n!/(k!*(n-k)!)
- Binomial
	Input: double, double, int
	Output: double

	Recebe dois doubles, x e y, e um inteiro, n, e calcula o Binômio de Newton "(x+y)^n"
	Não calcula "(x-y)^n"
- Main
	Teste de todos os métodos citados acima
	A saída esperada para o Main default é
		29.0
		11.0
		400.0
		1.0
		8000.0 125.0 64.0
		125.0

O CallGraph gerado pelo Main do arquivo Teste.java citado acima está salvo em cg.pdf

Este grafo ilustra as chamadas entre as funções. Quem está no início da seta é quem está chamando uma nova função e quem está na ponta da seta é a função que está sendo chamada.
Ele é importante porque mostra as ligações entre os métodos, o que o torna uma ferramenta muito importante para verificar o fluxo de chamadas de métodos em um programa.
Este CallGraph é do tipo dinâmico, ou seja, mostra o que acontece no programa em um "run". Esse tipo de CallGraph é mais específico que os CallGraphs do tipo estático, fazendo com que, se for necessário entender dois testes, seja necessário criar dois CallGraphs.


