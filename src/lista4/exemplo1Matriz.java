package lista4;

public class exemplo1Matriz {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		double soma;
		notasAlunos[0][0] = 10.0;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 5.5;
		notasAlunos[0][3] = 6.5;
		
		notasAlunos[1][0] = 9.5;
		notasAlunos[1][1] = 8.0;
		notasAlunos[1][2] = 7.5;
		notasAlunos[1][3] = 4.5;
		
		System.out.println("Calculando a média dos Alunos");
		
		
		for(int linha = 0; linha < notasAlunos.length; linha++) {// andar nas linhas
			
			soma = 0.0;
			for(int coluna = 0; coluna < notasAlunos[linha].length; coluna++) {// andar nas colunas
			soma = soma + notasAlunos[linha][coluna];
				
			}
			System.out.println("A média das notas: " + (soma / 4));
		}
		

	}

}
