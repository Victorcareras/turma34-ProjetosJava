package lista5ex4;

public class testaFuncionario {

	public static void main(String[] args) {


		funcionario funci = new funcionario();
		
		funci.setFunções("Gerente");
		funci.setIdade(26);
		funci.setNome("Jorge");
		funci.setResponsabilidade("Responsavel");
		System.out.println("Nome do Funcionario: " + funci.getNome());
		System.out.println("Idade do Funcionario: "+ funci.getIdade());
		System.out.println("Função do Funcionario: "+ funci.getFunções());
		System.out.println("O gerente é " + funci.getResponsabilidade() + " pelo funcionamento da empresa.");
		
	}

}
