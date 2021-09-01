package exercicio1;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Duração do evento em Segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		
		minutos= segundos % 3600 / 60;
		
		segundos = minutos % 60;
		
		System.out.println("O evento durou: " + horas +" horas " + minutos + " minutos " + segundos + " segundos ");
		
		leia.close();
		
		
		
		
		

	}

}
