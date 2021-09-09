package lista4;

public class exemploVetorMatriz1 {

	public static void main(String[] args) {


		int[] arrayVetor = new int[10];// new é uma instrucao que serve pra fazer um objeto dentro do programa/projeto
		arrayVetor[2] = 200;
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("Posição: " + i + " - "+ arrayVetor[i]);
		}
		

	}

}
