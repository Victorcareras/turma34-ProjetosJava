programa
{         
		inclua biblioteca Matematica --> mat


	funcao inicio()
	{
		real custoFabrica, percentagemDistribuidora, percentagemImposto, custoComprador
		real arredondamento 

		escreva("Qual o custo de Fábrica: ")
		leia(custoFabrica)

		percentagemDistribuidora = (custoFabrica*0.28)-custoFabrica + custoFabrica

		percentagemImposto = (custoFabrica*0.45)-custoFabrica + custoFabrica


		custoComprador = custoFabrica + percentagemDistribuidora + percentagemImposto 
		arredondamento = mat.arredondar(custoComprador,2)

		escreva( "O custo do Comprador é: ", arredondamento)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 591; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */