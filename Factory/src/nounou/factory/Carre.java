package nounou.factory;

public class Carre extends Forme {
 
	public Carre(){
		super();
		setNombreCote(4);		
	}

	@Override
	public void affiche() {
		System.out.println("je suis un carre ");
		
	}
	
	
}
