package lista5ex2;

public class testaAviao {

	public static void main(String[] args) {
		aviao aviao = new aviao();
		
		System.out.println("Algumas coisas principais para um avi�o: ");
		
		aviao.setAsa("Asa");
		aviao.setAssentos("Assentos");
		aviao.setCabine("Cabine");
		aviao.setMotor("Motor");
		aviao.setPainelDeControle("Painel De Controle");
		aviao.setpiloto("Piloto");
		aviao.setcoopiloto("Coopiloto");
		
		System.out.println("A "+ aviao.getAsa() + " � de suma import�ncia para o funcionamento do Avi�o.");
		System.out.println("Os " + aviao.getAssentos() + " s�o muito importantes para o conforto dos passageiros.");
		System.out.println("O " + aviao.getMotor() + " � essencial para o funcionamento do Avi�o.");
		System.out.println("O " + aviao.getPainelDeControle() +" � importante pois da uma no��o sobre tudo que acontece dentro e fora do Avi�o.");
		System.out.println("O "+ aviao.getPiloto() +" � fundamental para a locomo��o do Avi�o.");
		System.out.println("O "+ aviao.getCoopiloto() +" � muito importante, pois se o piloto se sentir mal quem comanda o Avi�o � ele.");
		


		

	}

}
