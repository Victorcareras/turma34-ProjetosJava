package lista5ex4;

public class testaFuncionario {

	public static void main(String[] args) {


		funcionario funci = new funcionario();
		
		funci.setFun��es("Gerente");
		funci.setIdade(26);
		funci.setNome("Jorge");
		funci.setResponsabilidade("Responsavel");
		System.out.println("Nome do Funcionario: " + funci.getNome());
		System.out.println("Idade do Funcionario: "+ funci.getIdade());
		System.out.println("Fun��o do Funcionario: "+ funci.getFun��es());
		System.out.println("O gerente � " + funci.getResponsabilidade() + " pelo funcionamento da empresa.");
		
	}

}
