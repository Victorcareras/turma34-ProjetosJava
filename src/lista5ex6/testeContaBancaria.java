package lista5ex6;

public class testeContaBancaria {

	public static void main(String[] args) {
		contabancaria conta1 = new contabancaria();
		
		System.out.println("Alguns componentes de conta bancaria:");
		conta1.setCliente("Victor");
		conta1.setDinheiro(1000);
		conta1.setLogin("victor123");
		conta1.setSenha("****");
		conta1.setTransferencia("Transferencia");
		
		System.out.println("Cliente: " + conta1.getCliente());
		System.out.println("Login: " + conta1.getLogin());
		System.out.println("Senha: " + conta1.getSenha());
		System.out.println("Saldo em conta: " + conta1.getDinheiro());
		System.out.println(conta1.getTransferencia()+ " realizada com sucesso.");
		

	}

}
