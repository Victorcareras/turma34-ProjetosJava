package lista5ex5;

public class testePatinete {

	public static void main(String[] args) {


		patinete patinete = new patinete();
		
		System.out.println("Algumas partes importantes para o Patinete funcionar: \n");
		
		patinete.setCondutor("Condutor");
		patinete.setManete("Manete");
		patinete.setParafusos("Parafusos");
		patinete.setRodas("Rodas");
		
		System.out.println("-Sem um " + patinete.getCondutor()+ " o patinete n�o teria como funcionar.");
		System.out.println("-Sem " + patinete.getManete() + "ficaria desconfort�vel.");
		System.out.println("-Sem " + patinete.getParafusos() + "n�o existiria patinete.");
		System.out.println("-Sem " + patinete.getRodas() + "n�o teria como se locomover com o patinete.");
	}
	

}
