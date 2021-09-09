package lista5ex3;

public class testaProdutoEletroinco {

	public static void main(String[] args) {

		produtoEletronico pe = new produtoEletronico();
		
		System.out.println("Alguns componentes importantes para Produtos Eletrônicos: ");
		
		pe.setFiacao("Fiação");
		pe.setPlacaDeCircuitos("Placas de Circuotos");
		pe.setTelas("Telas");
		
		System.out.println("A "+ pe.getFiacao() + " Fiação é essencial para o funcionamento de Produtos Eletrônicos.");
		System.out.println("Os "+ pe.getPlacaDeCircuitos() + " São essenciais para o funcionamento de Produtos Eletrônicos.");
		System.out.println("As "+ pe.getTelas() + " São essenciais para o funcionamento de Produtos Eletrônicos.");
		
		
		
	}

}
