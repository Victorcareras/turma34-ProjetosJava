package lista6ex1e2;

public class testaAnimais {

	public static void main(String[] args) {
		cachorro cachorro = new cachorro();
		cavalo cavalo = new cavalo();
		preguiça preguica = new preguiça();
		
		cachorro.apresente("kako", 15);
		cachorro.correr();
		cachorro.setSom("Emitindo som: ");
		System.out.println("Auauau" + cachorro.getSom());
		
		
		
		cavalo.apresente("HolHorse", 33);
		cavalo.correr();
		cavalo.setSom("Emitindo som: ");
		System.out.println("iiihihiii" + cavalo.getSom());
		
		
		
		preguica.apresente("Flash", 15);
		preguica.subirArvore();
		preguica.setSom("AA");
		System.out.println("Emitindo som: "+ preguica.getSom());
		
	}

}
