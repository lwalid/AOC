package nounou.factory.couleur;

import nounou.factory.AbstractFactory;

public abstract class Couleur  {

	private String couleur;
	
	public void setCouleur(String couleur){
		this.couleur=couleur;
	}
	
	public abstract void affiche();
}
