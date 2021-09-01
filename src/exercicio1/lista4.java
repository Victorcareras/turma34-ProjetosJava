package exercicio1;

import java.util.Scanner;

public class lista4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, r, s; 
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Escreva o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Escreva o valor de C: ");
		c = leia.nextDouble();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
	
		d = (r + s) / 2;
		
		
		System.out.println("A expressão é: " + d);
		
		leia.close();
	} 
}