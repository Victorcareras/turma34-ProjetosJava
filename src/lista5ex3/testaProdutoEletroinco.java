package lista5ex3;

public class testaProdutoEletroinco {

	public static void main(String[] args) {

		produtoEletronico pe = new produtoEletronico();
		
		System.out.println("Alguns componentes importantes para Produtos Eletr�nicos: ");
		
		pe.setFiacao("Fia��o");
		pe.setPlacaDeCircuitos("Placas de Circuotos");
		pe.setTelas("Telas");
		
		System.out.println("A "+ pe.getFiacao() + " Fia��o � essencial para o funcionamento de Produtos Eletr�nicos.");
		System.out.println("Os "+ pe.getPlacaDeCircuitos() + " S�o essenciais para o funcionamento de Produtos Eletr�nicos.");
		System.out.println("As "+ pe.getTelas() + " S�o essenciais para o funcionamento de Produtos Eletr�nicos.");
		
		
		
	}

}
