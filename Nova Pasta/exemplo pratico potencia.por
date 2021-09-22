programa {

/*Programa: Utilizando Biblioteca
 *Autor: Victor
 *Data: 20/08/2021 
 */
	inclua biblioteca Matematica --> mat
	funcao inicio() {

	//declaração de variaveis
	real a,b, potencia, raiz

	escreva("Entre com o valor de A: ")
	leia(a)

	escreva("Entre com o valor de B: ")
	leia(b)

	//cálculo de potenciação
	potencia = mat.potencia((a+b), 2.0)
	//cáolculo de radiciação
	raiz = mat.raiz(potencia, 2.0)

	escreva("Potencia de A + B: " + mat.arredondar(potencia, 2.0))
	escreva("\nRaiz de A + B: " + mat.arredondar(raiz, 2))


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */