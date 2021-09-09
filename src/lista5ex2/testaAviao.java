package lista5ex2;

public class testaAviao {

	public static void main(String[] args) {
		aviao aviao = new aviao();
		
		System.out.println("Algumas coisas principais para um avião: ");
		
		aviao.setAsa("Asa");
		aviao.setAssentos("Assentos");
		aviao.setCabine("Cabine");
		aviao.setMotor("Motor");
		aviao.setPainelDeControle("Painel De Controle");
		aviao.setpiloto("Piloto");
		aviao.setcoopiloto("Coopiloto");
		
		System.out.println("A "+ aviao.getAsa() + " é de suma importância para o funcionamento do Avião.");
		System.out.println("Os " + aviao.getAssentos() + " são muito importantes para o conforto dos passageiros.");
		System.out.println("O " + aviao.getMotor() + " é essencial para o funcionamento do Avião.");
		System.out.println("O " + aviao.getPainelDeControle() +" é importante pois da uma noção sobre tudo que acontece dentro e fora do Avião.");
		System.out.println("O "+ aviao.getPiloto() +" é fundamental para a locomoção do Avião.");
		System.out.println("O "+ aviao.getCoopiloto() +" é muito importante, pois se o piloto se sentir mal quem comanda o Avião é ele.");
		


		

	}

}
