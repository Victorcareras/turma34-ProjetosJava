package lista5;

public class testaCliente {

	public static void main(String[] args) {
		cliente cli1 = new cliente();
			
		cli1.setNome("Vagner");
		cli1.setCpf("555.808.985-11");
		cli1.setEmail("vagner@gmail.com");
		cli1.setEndereco("Rua Da Felicidade, 190");
		cli1.setIdade(104);
		System.out.println("Nome do Cliente: "+cli1.getNome());
		System.out.println("Idade do Cliente: " + cli1.getIdade());
	}

}
