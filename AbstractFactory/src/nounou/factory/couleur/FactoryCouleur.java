package nounou.factory.couleur;

import nounou.factory.AbstractFactory;
import nounou.factory.form.Forme;

public class FactoryCouleur extends AbstractFactory{
	
	public Couleur getCouleur(String nom){
		Couleur couleur=null;
		if(nom.equals("bleu")){
			couleur=new Bleu();
		}
		else if(nom.equals("vert")){
			couleur= new Vert();
		}

		return couleur;
	}
	
	public Forme getForme(String nom){
		return null;
	}
}
