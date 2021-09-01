package exercicio1;

import java.util.Scanner;

public class lista1 {

	public static void main(String[] args) {
		
		int idadeDias, idadeAnos, idadeMeses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
		idadeAnos = leia.nextInt();
		
		System.out.println("Quantos meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.println("Quantos Dias: ");
		idadeDias = leia.nextInt();
		
		
		idadeAnos = idadeAnos * 365;
		idadeMeses = idadeMeses * 30;
		
		
		System.out.println("Sua idade em dias é: " + (idadeAnos + idadeMeses + idadeDias));
		
		leia.close();

	}

}
