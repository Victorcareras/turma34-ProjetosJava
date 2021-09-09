package lista4;

import java.util.Scanner;

public class exemplomatriz2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[][] notasAlunos = new double[2][4];

		System.out.println("###Notas dos Alunos###");

		for (int linha = 0; linha < notasAlunos.length; linha++) {// andar nas colunas
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				System.out.printf("Digite às Notas: %d %d:", linha, coluna);
				notasAlunos[linha][coluna] = entrada.nextDouble();

			}

		}
		for (int linha = 0; linha < notasAlunos.length; linha++) {// andar nas colunas
			for (int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				System.out.print(notasAlunos[linha][coluna] + "|");
			}
			System.out.println();

		}
		

	}

}
