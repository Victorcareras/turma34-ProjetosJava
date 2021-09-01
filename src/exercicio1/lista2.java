package exercicio1;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias, idadeAnos, idadeMeses;
		
		System.out.println("Digite sua idade em Dias: ");
		
		idadeDias = leia.nextInt();
		
		
		
		idadeAnos = idadeDias / 365;
		
		idadeMeses = (idadeDias % 365) / 30;
		
		idadeDias = idadeMeses % 30;
		
		System.out.println(" Você tem " + idadeAnos + " anos " + idadeMeses + " meses " + idadeDias + " e dias: ");
		
          leia.close();
          
          
	}

}
