package lista4;

import java.util.Scanner;

public class exemplo2MatrizVetor {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in); 
		
		
		double[] notas = new double[4];// 0...3 nao 1...3
		double soma = 0.0, media = 0.0;
		
		int i;
		
		System.out.println("Digite �s quatro notas do Aluno: ");
		for(i = 0; i <= 3; i++) {
			System.out.println("Digite a " + (i + 1) + "� Nota:");
			notas[i] = entrada.nextDouble();//adicionando valor nas posicoes do vetor
			soma += notas[i];//somando os valores do vetor
			media = soma / 4;//Divisao valor de soma por 4 pra encontrar a media
		
			}
		if(media >= 7.0) {
			System.out.println("Aprovado" + "\nA m�dia � " + media);
			}
		else {
			System.out.println("Reprovado");
		}
		entrada.close();
		
		
			
		//System.out.println("A soma das notas: " + soma);

	}

}
