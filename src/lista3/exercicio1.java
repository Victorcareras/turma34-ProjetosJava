package lista3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int limite = 1999;
		
		
		for(numero = 1000; numero <= limite; numero++ ) {
			
		
			
			if(numero % 11 == 5) {
				
				System.out.println("Seu Numero atual é: " + numero );
				
				Thread.sleep(500);
				
				
			
			}
		}
		

	}

}
