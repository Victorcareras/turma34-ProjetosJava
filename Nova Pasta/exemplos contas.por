programa {
	
	/*Programa: Operadores Aritmétcos
	 * Autor: Victor
	 * Data: 07/05/2001
	 */
	
	funcao inicio() {

	// + --> Soma
	// - --> Subtração
	// * --> Multiplicação
	// / --> Divisão
	// % --> Resto da Divisão

	inteiro numero1, numero2, soma, subtracao, multiplicacao, divisao, restoDivisao

	escreva("Digite o Primeiro Número: ")
	leia(numero1)

	escreva("Digite o Segundo Número: ")
	leia(numero2)

	soma = numero1 + numero2 
	subtracao = numero1 + (numero1 - numero2)
	multiplicacao = numero1 * numero2
	divisao = numero1 / numero2
	restoDivisao = numero1 % numero2

	escreva("soma : " + soma)
	escreva("\nSubtração : " + subtracao)
	escreva("\nMultiplicação : " + multiplicacao)
	escreva("\nDivisão : " + divisao)
	escreva("\nResto da Divisão : " + restoDivisao)
	

	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */