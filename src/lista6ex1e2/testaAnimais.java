package lista6ex1e2;

public class testaAnimais {

	public static void main(String[] args) {
		cachorro cachorro = new cachorro();
		cavalo cavalo = new cavalo();
		preguiça preguica = new preguiça();
		
		cachorro.apresente("kako", 15);
		cachorro.correr();
		cachorro.emitirSom();
		System.out.println("Auauau");
		
		
		cavalo.apresente("HolHorse", 33);
		cavalo.correr();
		cavalo.emitirSom();
		System.out.println("iiihihiii");
		
		
		
		preguica.apresente("Flash", 15);
		preguica.subirArvore();
		preguica.emitirSom();
		System.out.println("A");
		
	}

}
