package lista2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {


			Scanner leia = new Scanner(System.in);
			
			int nota1, nota2,  nota3;
			
			System.out.println("Digite o primeiro n�mero: ");
			nota1 = leia.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			nota2 = leia.nextInt();
			System.out.println("Digite o terceiro n�mero ");
			nota3 = leia.nextInt();
			
			
			if( nota1 > nota2 && nota1 > nota3) {
				System.out.println("Sua maior nota ser�: " + nota1);
				}
			
			if(nota2 > nota1 && nota2 > nota3) {
				System.out.println("Sua maior nota ser�: " + nota2);
				}
			
			if(nota3 > nota1 && nota3 > nota2) {
				System.out.println("Sua maior nota ser�: " + nota3);
				}
			
			leia.close();
			
			
			
			
	}

}
