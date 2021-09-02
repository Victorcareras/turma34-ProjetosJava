package lista2;

import java.util.Scanner;

public class ex4Lista2 {

	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int num;
		double raiz, elevado;
		
		System.out.println("Digite um número inteiro: ");
		num =leia.nextInt();
		
		if(num % 2==0) {
			System.out.println("Par.........");
			raiz = Math.sqrt(num);
			System.out.println("Raiz Quadrada: "+ raiz);
		}
		else if(num % 2 == 1) {
			System.out.println("Impar........");
			elevado = Math.pow(num, 2);
			System.out.println("Potência: " + elevado);
		}
		
		
		
		
		
}
}
