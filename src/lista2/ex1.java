package lista2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {


			Scanner leia = new Scanner(System.in);
			
			int nota1, nota2,  nota3;
			
			System.out.println("Digite o primeiro número: ");
			nota1 = leia.nextInt();
			System.out.println("Digite o segundo número: ");
			nota2 = leia.nextInt();
			System.out.println("Digite o terceiro número ");
			nota3 = leia.nextInt();
			
			
			if( nota1 > nota2 && nota1 > nota3) {
				System.out.println("Sua maior nota será: " + nota1);
				}
			
			if(nota2 > nota1 && nota2 > nota3) {
				System.out.println("Sua maior nota será: " + nota2);
				}
			
			if(nota3 > nota1 && nota3 > nota2) {
				System.out.println("Sua maior nota será: " + nota3);
				}
			
			leia.close();
			
			
			
			
	}

}
