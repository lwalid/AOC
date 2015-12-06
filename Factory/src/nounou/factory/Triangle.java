package nounou.factory;

public class Triangle extends Forme {

	public Triangle(){
		super();
		setNombreCote(3);		
	}

	@Override
	public void affiche() {
		System.out.println("je suis un traingle ");

	}

}
