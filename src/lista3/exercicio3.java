package lista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade = 0, total50 = 0, totalIdade = 0;
		int total21 = 0;
		
		
		// do while que identifica e guarda a idade dos usuarios.
		do{
			//if identifica quantos usuarios existem com menos de 21 anos.
			if(idade < 21) {
				total21++;
				
			}
			if(idade > 50) {//if identifica quantos usuarios existem com mais de 50 anos.
				total50++;
				
				
			}
			System.out.println("Digite sua idade, e para encerrar o codigo digite -99: ");//imprimir a idade do usuario, fazer o loop e so parar quando o usuario digitar -99
			idade = leia.nextInt();
				
			
			
		}while(idade != -99);//while = enquanto idade for diferente de -99
		total21--; // subtrai 1 valor da variavel.
		System.out.println("Total menos de 21 anos: " + total21);// imprimir o total de menos que 21 anos.
		
		System.out.println("Total mais de 50 anos: " + total50);// impriir o total de mais que  50 anos.
		
		
		
		
		
		
		
		
		
	
		
		
		//while()
		
		
		
		
		
		
		
		
		
		
		

	}

}
