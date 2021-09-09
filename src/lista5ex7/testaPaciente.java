package lista5ex7;

public class testaPaciente {

	public static void main(String[] args) {
		
		paciente paciente1 = new paciente();
		
		paciente1.setIdade(20);
		paciente1.setNome("victor");
		paciente1.setSexo("Masculino");
		
		System.out.println("Me chamo " + paciente1.getNome());
		System.out.println(paciente1.getSexo());
		System.out.println("Tenho " + paciente1.getIdade() + " de idade.");
		

		
	}

}
